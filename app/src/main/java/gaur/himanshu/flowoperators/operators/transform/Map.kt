package gaur.himanshu.flowoperators.operators.transform

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

private val sourceFlow = flow {
    emit(1)
    emit(2)
    emit(3)
    emit(4)
    emit(5)
    emit(6)
    emit(7)
    emit(8)
    emit(9)
    emit(10)
    emit(11)
    emit(12)
}

fun main() = runBlocking {

}