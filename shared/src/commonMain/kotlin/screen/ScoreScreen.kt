package screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp


@Composable
fun ScoreScreen(score: Int, totalScore: Int, onRetakeClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Score",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(8.dp)
            )

            Text(
                text = "Resultat : $score / $totalScore",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(8.dp)
            )

            Button(
                onClick = { onRetakeClick() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "le texte")
            }
        }
    }
}