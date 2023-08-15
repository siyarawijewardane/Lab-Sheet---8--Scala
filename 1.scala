import scala.io.StdIn

object InterestCalculator {

  def calculateInterest: Double => Double = {

    case amount if amount >= 0 && amount <= 20000 => amount * 0.02
    case amount if amount > 20000 && amount <= 200000 => amount * 0.04
    case amount if amount > 200000 && amount <= 2000000 => amount * 0.035
    case amount if amount > 2000000 => amount * 0.065   // assuming that the amount won't be a minus value.

  }

  def main(args: Array[String]): Unit = {

    println("Enter the amount : ")
    val depositAmount = StdIn.readInt();

    val interestCalculator = calculateInterest
    val interest = interestCalculator(depositAmount)

    println(s"For a deposit amount of Rs. $depositAmount, the earned interest is Rs. $interest")
  }
}
