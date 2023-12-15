import androidx.compose.ui.window.ComposeUIViewController

actual fun getPlatformName(): String = "iOS"

import moe.tlaster.precompose.PreComposeApplication
fun MainViewController(): UIViewController = PreComposeApplication() { App() }
