package gaur.himanshu.flowoperators.operators.combining

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking

val numbersSourceFlow = flow {
    emit(1)
    delay(300) // Delay between emissions
    emit(2)
    delay(300)
    emit(3)
}

val lettersSourceFlow = flow {
    emit("A")
    delay(200)
    emit("B")
    delay(200)
    emit("C")
}


// Collect the combined flow
fun main() = runBlocking {


    numbersSourceFlow.zip(lettersSourceFlow) { number, letter ->
        "${number} ${letter}"
    }.collectLatest {
        println(it)
    }

    println()

    combine(numbersSourceFlow, lettersSourceFlow) { number, letter ->

        "$number $letter"

    }.collectLatest {
        println(it)
    }

}
