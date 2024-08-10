package gaur.himanshu.flowoperators.operators.filtering

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
     val searchQueryFlow = flow {
        emit("k") // User types 'k'
        delay(100)
        emit("ko") // User types 'o'
        delay(100)
        emit("kot") // User types 't'
        delay(500) // Pause for a moment
        emit("kotlin") // User types 'lin'
        delay(100)
        emit("kotlin flow") // User types ' flow'
    }

}
