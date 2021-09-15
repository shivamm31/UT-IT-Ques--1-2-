package ValidatorTest

import com.validator.CheckEmail
import org.scalatest.funsuite.AnyFunSuite

class CheckEmailTest extends AnyFunSuite {

  val checkEmail = new CheckEmail
  test("Check Email when the Email ID has valid recipient name") {

    val expectedResult = true
    val result = checkEmail.checkRecipient("shivamroy31@gmail.com")
    assert(result == expectedResult)
  }
  test("Check Email when the Email ID has invalid recipient name") {

    val expectedResult = false
    val result = checkEmail.checkRecipient("shivamroy##@gmail.com")
    assert(result == expectedResult)
  }

  test("Checking if it returns false on passing an invalid Email Id without '@'"){
    val expectedResult = false
    val result = checkEmail.checkAtTheRate("shivamroy#gmail.com")
    assert(result == expectedResult)
  }

  test("Checking if it returns false on passing invalid character on domain"){
    val expectedResult = false
    val result = checkEmail.checkDomainName("shivamroy@gma&l.com")
    assert(result == expectedResult)
  }
  test("Checking if it returns invalid emailID with invalid top level domain"){
    val expectedResult = false
    val result = checkEmail.checkTopLevelDomain("shivamroy31@gmail.com")
  }
}



