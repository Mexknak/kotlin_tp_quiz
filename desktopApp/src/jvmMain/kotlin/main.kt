import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

import moe.tlaster.precompose.PreComposeWindow
fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "QuizzApp") {
        DesktopApp()
    }
}