import scalaxb._

trait LoggerHttpClients extends HttpClients {
  val httpClient = new LoggerHttpClient {}

  trait LoggerHttpClient extends HttpClient {
    import dispatch._

    def request(in: String, address: java.net.URI, headers: Map[String, String]): String = {
      val http = new Http
      println("[request] " + in)
      val out = http x (url(address.toString) << (in) <:< headers as_str)
      println("[response] " + out)
      out
    }
  }
}
