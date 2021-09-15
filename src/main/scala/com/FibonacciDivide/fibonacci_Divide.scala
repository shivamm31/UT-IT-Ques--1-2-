package com.FibonacciDivide

import scala.collection.mutable.ListBuffer

class fibonacci_Divide extends divide with fibonacci {

  override def division (Numerator:Int, Denominator:Int): Int = {
    Numerator/Denominator
  }
  @Override
  override def fibonacci(NumberOfTerms: Int): ListBuffer[Int] = {

    if (NumberOfTerms < 0) throw new NegativeArraySizeException("Negative number not Allowed in Fibonacci Series")

    var FirstTerm: Int = 0
    var SecondTerm: Int = 1
    var sum: Int = 0
    val fibonacciSeries = new ListBuffer[Int]
    if (NumberOfTerms == 1) return (fibonacciSeries += FirstTerm)

    fibonacciSeries += (FirstTerm, SecondTerm)
    if (NumberOfTerms == 2) return fibonacciSeries
    for (i <- 3 to NumberOfTerms) {

      sum = FirstTerm + SecondTerm
      fibonacciSeries.append(sum)
      FirstTerm = SecondTerm
      SecondTerm = sum
    }

    fibonacciSeries
  }
}
