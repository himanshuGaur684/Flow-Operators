package gaur.himanshu.flowoperators.operators.filtering

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

private val sourceFlow = flow {
    for (i in 1..10) {
        emit(i)
        delay(100) // Emitting items every 100ms
    }
}


fun main() = runBlocking {

}
