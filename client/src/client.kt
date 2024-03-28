import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.Socket

fun main() {
    client()
}

fun client() {
    val client = Socket("localhost", 4444)
    val output = PrintWriter(client.getOutputStream(), true)
    val input = BufferedReader(InputStreamReader(client.inputStream))

    output.println("Star")
    println("[${input.readLine()}]")
    client.close()
}