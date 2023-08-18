import scala.io.StdIn

object Question02{

    def printMessage: Int => String = {
        
        case n if n <= 0 => "Negative/Zero is given"
        case n if n % 2 == 0 => "Even number is given"
        case n => "Odd number is given"
    }

    def main(args: Array[String]): Unit = {

        print("Enter an integer : ")
        val input = StdIn.readInt()
        println(printMessage(input))
    }

}
    


