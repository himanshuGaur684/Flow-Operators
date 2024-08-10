package gaur.himanshu.flowoperators.operators.filtering

import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

private val sourceFlow = flow {
    for (i in 1..10) {
        emit(i)
    }
}

// Collect the flow
fun main() = runBlocking {

}
