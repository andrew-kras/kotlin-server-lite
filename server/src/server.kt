import java.net.ServerSocket
import java.net.Socket
import kotlin.concurrent.thread

fun main() {
    val server = ServerSocket(4444)

    while (true) {
        val socket = server.accept()

        thread { server(socket) }
    }
}

fun server(client: Socket) {
    val output = client.getOutputStream()
    val input = client.getInputStream()

    for (i in 1..4)
        println(input.read())
    client.close()
}
