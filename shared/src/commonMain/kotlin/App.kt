import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import dataClass.Answer
import dataClass.Question
import dataClass.Quiz
import org.jetbrains.compose.resources.ExperimentalResourceApi
import screen.QuestionScreen

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        val quiz = Quiz(
            listOf(
                Question(
                    0,
                    "Question 1",
                    0,
                    listOf(
                        Answer(0,"A"),
                        Answer(1,"B"),
                        Answer(2,"C"),
                        Answer(3,"La réponse D"),
                    )
                ),
                Question(
                    1,
                    "Question 2",
                    0,
                    listOf(
                        Answer(0,"A"),
                        Answer(1,"B"),
                        Answer(2,"C"),
                        Answer(3,"La réponse D"),
                    )
                ),
                Question(
                    2,
                    "Question 3",
                    0,
                    listOf(
                        Answer(0,"A"),
                        Answer(1,"B"),
                        Answer(2,"C"),
                        Answer(3,"La réponse D"),
                    )
                )
            )
        )

        QuestionScreen(quiz)
    }
}

expect fun getPlatformName(): String