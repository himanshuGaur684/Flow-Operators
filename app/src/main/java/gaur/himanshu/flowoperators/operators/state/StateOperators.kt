package gaur.himanshu.flowoperators.operators.state

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

private val sourceFlow = flow {
    for (i in 1..5) {
        emit(i)
        delay(1000) // Delay between emissions
    }
}

fun main() = runBlocking {

}
