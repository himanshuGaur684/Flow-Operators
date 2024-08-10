package gaur.himanshu.flowoperators.operators.transform

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun fetchOrders(userId: Int): Flow<String> = flow {
    emit("Order 1 for User $userId")
    delay(100) // Simulate some delay
    emit("Order 2 for User $userId")
}

val userIdsFlow = flow {
    emit(1)
    delay(50)
    emit(2)
    delay(50)
    emit(3)
}




fun main() = runBlocking {

}
