object NewsToday extends App {
  import scala.io.Source
  import scala.xml.XML

  val rssUrl = "https://news.google.com/news?pz=1&cf=all&ned=in&hl=en&output=rss"
  val rssSource = Source.fromURL(rssUrl)
  val xmlData = rssSource.getLines.mkString("\n")
  val xml = XML.loadString(xmlData)
  val items = (xml \ "channel" \ "item")
  items map ( x => (x \ "title").text  ) foreach println
}
