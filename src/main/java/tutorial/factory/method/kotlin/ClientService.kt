package tutorial.factory.method.kotlin

class ClientService private constructor(){
    companion object{
        private val clientService = ClientService()
        @JvmStatic
        fun createInstance() = clientService
    }
}