class Greeting(_word: String) {
    val msg = _word
    def helloworld() {
        println(msg)
    }
}

object Hello {
    def main(args: Array[String]): Unit = {
        val gree = new Greeting("Hello World")
        gree.helloworld()
    }
}
