package dataClass

@kotlinx.serialization.Serializable
data class Quiz(
    var questions: List<Question>
)