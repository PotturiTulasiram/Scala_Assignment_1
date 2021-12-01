import org.scalatest.funsuite.AnyFunSuite

class testSolution07 extends AnyFunSuite {
  test("Solution07"){
    assert(Solution07.happyStringorNot("mississippi",0) === "Not Happy")
    assert(Solution07.happyStringorNot("mississippi",2) === "Happy")
    assert(Solution07.happyStringorNot("mississippi",10) === "Not Happy")
    assert(Solution07.happyStringorNot("mississippi",11) === "Please provide Valid Index")
  }
}
