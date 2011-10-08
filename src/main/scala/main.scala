object Main extends App {
  val service = (new hotelbeds.FrontendServiceSoapBindings with scalaxb.Soap11Clients with scalaxb.DispatchHttpClients {}).service
  println(service.getHotelCountryList(scalaxb.DataRecord(None, None, "")))
}
