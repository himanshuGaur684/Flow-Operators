package gaur.himanshu.flowoperators.operators.transform

import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.transform
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

    sourceFlow.transform { userAction ->
        when (userAction) {
            is UserAction.Click -> emit("click-> ${userAction.x} ${userAction.y}")
            UserAction.LongPress -> emit("long press")
            is UserAction.Swipe -> emit("swipe -> ${userAction.length}")
        }
    }.collectLatest {
        println(it)
    }


}