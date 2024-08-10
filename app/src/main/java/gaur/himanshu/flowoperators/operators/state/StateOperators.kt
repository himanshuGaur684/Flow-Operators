package gaur.himanshu.flowoperators.operators.state

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.runBlocking

private val sourceFlow = flow {
    for (i in 1..5) {
        emit(i)
        delay(1000) // Delay between emissions
    }
}

fun main() = runBlocking {

    val scope = CoroutineScope(Dispatchers.IO)
    val stateFlow = sourceFlow.stateIn(scope)
    val sharedFlow = sourceFlow.shareIn(scope, started = SharingStarted.Eagerly, replay = 0)

}
