package gaur.himanshu.flowoperators.operators.filtering

import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.flow.dropWhile
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.filterNot
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.runBlocking

private val sourceFlow = flow {
    for (i in 1..10) {
        emit(i)
    }
}

// Collect the flow
fun main() = runBlocking {

    sourceFlow.filter { it%2==0 }
        .collectLatest {
            println("even -> ${it}")
        }

    sourceFlow.filterNot { it%2==0 }
        .collectLatest {
            println("filterNot -> ${it}")
        }

    sourceFlow.take(3)
        .collectLatest {
            println("take -> $it")
        }

    sourceFlow.takeWhile { it<8 }
        .collectLatest {
            println("takeWhile -> ${it}")
        }

    sourceFlow.drop(3)
        .collectLatest {
            println("drop -> ${it}")
        }

    sourceFlow.dropWhile { it<5 }
        .collectLatest {
            println("dropWhile -> ${it}")
        }





}
