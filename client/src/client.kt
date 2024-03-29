import java.io.DataOutputStream
import java.net.Socket

fun main() {
    client()
}

fun client() {
    val client = Socket("localhost", 4444)
    val output = DataOutputStream(client.getOutputStream())
    val input = client.getInputStream()
    val byteUno = 1
    val byteDos = -1

    output.writeInt(33620229)
    client.close()
}