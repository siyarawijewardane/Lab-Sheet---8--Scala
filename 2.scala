import scala.io.StdIn

object NumberClassification {

    def main(args: Array[String]): Unit = {

        println("Enter the value : ")
        val input = StdIn.readInt()

        val result = input match {

        case x if x <= 0 => "Negative/Zero"
        case x if x % 2 == 0 => "Even Number"
        case x if x % 2 != 0 => "Odd Number"

        }

        print(result)

    }
    
}

