package gaur.himanshu.flowoperators.operators.transform

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

sealed class UserAction {
    data class Click(val x: Int, val y: Int) : UserAction()
    data class Swipe(val length: Int) : UserAction()
    data object LongPress : UserAction()
}

private val sourceFlow = flow {
    emit(UserAction.Click(x = 100, y = 200))
    emit(UserAction.Swipe(length = 150))
    emit(UserAction.LongPress)
    emit(UserAction.Click(x = 50, y = 50))
    emit(UserAction.Swipe(length = 50))
}


fun main() = runBlocking {

}