import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.ServerSocket
import java.net.Socket
import kotlin.concurrent.thread

fun main() {
    val server = ServerSocket(4444)

    while (true) {
        val socket = server.accept()

        thread { server(socket) }.start()
    }
}

fun server(socket: Socket) {
    val client: Socket = socket
    val output = PrintWriter(client.getOutputStream(), true)
    val input = BufferedReader(InputStreamReader(client.inputStream))

    output.println("${input.readLine()} Wars")
}
