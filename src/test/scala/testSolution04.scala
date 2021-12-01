import org.scalatest.funsuite.AnyFunSuite

class testSolution04 extends AnyFunSuite {
  test("Solutoin04"){
    assert(Solution04.ifString("Scala") === "IfScala")
    assert(Solution04.ifString("Ifscala") === "Ifscala")
  }
}
