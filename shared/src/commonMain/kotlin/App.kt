import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import dataClass.Quiz
import org.jetbrains.compose.resources.ExperimentalResourceApi
import screen.QuestionScreen

private val repository = QuizRepository()

@OptIn(ExperimentalResourceApi::class)
@Composable
internal fun App() {
    MaterialTheme {
        val questions = repository.questionState.collectAsState()

        if(questions.value.isNotEmpty()) {

            val quiz = Quiz(questions.value)
            QuestionScreen(quiz)
        }
    }
}

expect fun getPlatformName(): String