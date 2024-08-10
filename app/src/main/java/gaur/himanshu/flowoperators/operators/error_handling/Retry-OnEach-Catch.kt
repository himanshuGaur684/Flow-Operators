package gaur.himanshu.flowoperators.operators.error_handling

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.retry
import kotlinx.coroutines.runBlocking

fun networkRequest(): Flow<String> = flow {
    emit("Attempting network request...")
    delay(1000)
    if (Math.random() < 0.9) {
        throw Exception("Network request failed")
    }
    emit("Network request succeeded")
}


fun main() = runBlocking {

    networkRequest()
        .retry(1)
        .onEach {
            println("oneach -> $it")
        }.catch {
            println("catch -> ${it.message}")
        }
        .collectLatest {
            println("collect -> ${it}")
        }

}
