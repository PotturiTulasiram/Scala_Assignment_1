import org.scalatest.funsuite.AnyFunSuite


class testSolution01 extends AnyFunSuite {
  test("Solution01"){
    assert(Solution01.newString("India") === "InInInIn")
    assert(Solution01.newString("To") === "ToToToTo")
    assert(Solution01.newString("t") === "t")
  }
}
