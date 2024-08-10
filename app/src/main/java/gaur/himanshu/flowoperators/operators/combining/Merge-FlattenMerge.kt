package gaur.himanshu.flowoperators.operators.combining

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

// Define two flows with different delays
private val sourceFlowA = flow {
    emit("Flow A - Emission 1")
    delay(400)
    emit("Flow A - Emission 2")
}

private val sourceFlowB = flow {
    emit("Flow B - Emission 1")
    delay(200)
    emit("Flow B - Emission 2")
}


fun main() = runBlocking {

}
