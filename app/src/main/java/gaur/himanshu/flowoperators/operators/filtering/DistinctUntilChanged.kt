package gaur.himanshu.flowoperators.operators.filtering

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

private val sourceFlow = flow {
    emit(1)
    emit(1)
    emit(2)
    emit(2)
    emit(3)
    emit(3)
    emit(3)
    emit(4)
    emit(4)
    emit(5)
}


fun main() = runBlocking {

}
