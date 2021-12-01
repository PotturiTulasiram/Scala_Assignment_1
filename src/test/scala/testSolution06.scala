import org.scalatest.funsuite.AnyFunSuite

class testSolution06 extends AnyFunSuite {
  test("Solution06"){
    assert(Solution06.checkRange(10,60) === true)
    assert(Solution06.checkRange(22,44) === true)
    assert(Solution06.checkRange(25,55) === false)
    assert(Solution06.checkRange(15,45) === false)
  }
}
