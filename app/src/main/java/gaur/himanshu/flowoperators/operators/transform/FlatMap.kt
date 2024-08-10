package gaur.himanshu.flowoperators.operators.transform

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flatMapMerge
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

val concat = userIdsFlow.flatMapConcat { fetchOrders(it) }


val merge = userIdsFlow.flatMapMerge { fetchOrders(it) }

val latest = userIdsFlow.flatMapLatest { fetchOrders(it) }


fun main() = runBlocking {

    concat.collectLatest {
        println(it)
    }

    merge.collectLatest {
        println("merge-> " + it)
    }

    latest.collectLatest {
        println("latest-> ${it}")
    }


}
