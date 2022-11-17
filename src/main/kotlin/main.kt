import cdm.event.position.Portfolio
import net.corda.client.rpc.CordaRPCClient


fun main(args: Array<String>) {

    try {
        val client = CordaRPCClient(listOf())
        val connection = client.start("username", "password")
        val cordaRPCOperations = connection.proxy
        val p = Portfolio.builder().build()
    }
    catch(e : Exception){
        e.printStackTrace()
    }
    finally {
        print("fine")
    }

}