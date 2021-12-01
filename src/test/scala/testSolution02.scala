import org.scalatest.funsuite.AnyFunSuite

class testSolution02 extends AnyFunSuite {
  test("Solution02"){
    assert(Solution02.removeChar("Scala",2) === "Scla")
    assert(Solution02.removeChar("Scala",0) === "cala")
    assert(Solution02.removeChar("Scala",4) === "Scal")
    assert(Solution02.removeChar("Scala",5) === "Please Provide proper Index")
  }
}
