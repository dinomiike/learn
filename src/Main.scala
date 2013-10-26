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

//  Chapter 2

  println("Chapter 2")
  println("Conditional expressions:")
  if(x > 0) 1 else -1

  val s = if(x > 0) 1 else -1 // Do this
  var s1 = 0
  if (x > 0) s1 = 1 else s1 = -1 // Not this
  println(s + " : " + s1)

  note = "Scala has no switch statement. See pattern matching for similar functionality."
  println(note)

  // Looping
  var n = 10
  while (n > 0) {
    println("Item #" + n)
    n -= 1
  }

  n = 10
  for(i <- 1 to n) {
    println("Another Item #" + i)
  }

  val s3 = "Hello"
  var sum = 0
  for(i <- 0 until s3.size) { // The last value for i is s.size - 1
    println(s3(i))
    sum += s3(i)
  }
  println(sum)

  note = "This is an example of nesting loops with for syntax. Pretty terse syntax"
  println(note)
  for(i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")

  println("\n")

  for(i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")

  println("\n")

  // For Comprehension syntax
  for(i <- 1 to 10) yield i % 3

  for(c <- "Hello"; i <- 0 to 1) yield print((c + i).toChar) // Prints all characters through the input string, "Hello". The inner loop i <- 0 does the input string plus the next character

  println("\n")

  // Functions

  def abso(x: Double) = if(x >= 0) x else -x
  println(abso(10))
  println(abso(-555))

  note = "If the function isn't recursive you don't need to specify the type of the return value"
  println(note)

  note = "If the body of the function requires more than one expression, use a block. The last expression of the block becomes the value that the function returns."
  println(note)

  def fac(n: Int) = {
    var r = 1
    for(i <- 1 to n) r = r * i
    r
  }
  println("Factorial 10: " + fac(10))

  // Factorial using recursion
  def recFac(n: Int): Int = if(n <= 0) 1 else n * recFac(n - 1)
  println("Factorial 7 (Recursive): " + recFac(7))
}
