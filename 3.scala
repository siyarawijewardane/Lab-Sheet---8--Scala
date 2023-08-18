object Question03{

    val names = List ("Benny", "Niroshan", "Saman", "Kumara")

    def toUpper: String => String = _.toUpperCase()
    def toLower: String => String = _.toLowerCase()

    def formatNames: (String, String => String) => String = (name, func) => func(name)

    def main(args: Array[String]): Unit = {

      println(formatNames(names(0), toUpper))
      print(formatNames(names(1), toUpper).substring(0, 2) + formatNames(names(1).substring(2, 8), toLower) + "\n")
      println(formatNames(names(2), toLower))
      print(names(3).substring(0, 5) + formatNames(names(3).substring(5, 6), toUpper))
    }

}
