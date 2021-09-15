package FibonacciDivide

import com.FibonacciDivide.fibonacci_Divide
import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.ListBuffer

class fibonacci_DivideTest extends AnyFunSuite{

  val obj = new fibonacci_Divide
  test("Checking if the function returns correct value"){
    val expectedResult = 5
    val result = obj.division(25,5)
    assert(result==expectedResult)
  }
  test("Checking if the function returns incorrect value when divide by zero"){
    intercept[ArithmeticException] {

      obj.division(25, 0)
    }
  }
  test("Return a Fibonacci Series if the Number of Terms is 5"){

    val expectedResult = new ListBuffer[Int]
    expectedResult += (0,1,1,2,3)
    val result = obj.fibonacci(5)
    assert(expectedResult == result)
  }

  test("No. of Terms in a Fibonacci Series if given Negative throws Negative array size Exception"){
    intercept[NegativeArraySizeException]{
      obj.fibonacci(-7)
    }
  }
}
