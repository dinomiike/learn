import math._
import util._

object Main extends App {

  println("Let's learn Scala!")

  println("\n")

  println("Part 1.2 - Variables")

  val greeting = "Hello, world"
  println(greeting)

  var note = "Note that variables declared as val are constants and are immutable"
  println(note)

  note = "Variables declared as var are mutable"
  println(note)

  note = "Print a range of numbers"
  println(note)
  println(1.to(10))

  note = "Operators are methods!"
  println(note)
  println(1 to 10)

  println("4 + 5 = " + (4 + 5))
  println("Is the same as 4.+(5) = " + (4.+(5)) + ". Though it returns a double instead of an int.")
  println("+ is a method of 4 which is being given the parameter 5")

  val x: BigInt = 1234567890
  note = "You can perform operations on larger numbers with simple syntax, unlike Java."
  println("x is assigned the value of " + x)
  println("x * x * x is " + x * x * x)

  println("Calling functions and methods:")
  println("The square root of 2 is: " + sqrt(2))

  note = "In Scala, the underscore character [ _ ] functions as a wildcard or context. It is equivalent to this in Javascript"

  note = "The apply method is used to create a new instance of an item but is optional:"
  println(note)
  println("Hello(4) = " + "Hello"(4) + ". This syntax grabs the value of the string at position 4 in a 0-index, the way you'd normally see 'string[4]' in other languages")

  println("Create a random (positive) Long")
  val randomGenerator = Random
  val randomLong = abs(randomGenerator.nextInt())
  println(randomLong)
  val randomBigInt: BigInt = randomLong
  println("Convert the BigInt into base 36")
  println(randomBigInt.toString(36))
}
