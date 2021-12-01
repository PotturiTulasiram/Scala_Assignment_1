import org.scalatest.funsuite.AnyFunSuite

class testSolution05 extends AnyFunSuite {
  test("Solution05"){

    assert(Solution05.findNeatest(80,80) === 0)
    assert(Solution05.findNeatest(80,120) === 0)
    assert(Solution05.findNeatest(45,98) === 98)
    assert(Solution05.findNeatest(76,110) === 110)
    assert(Solution05.findNeatest(120,150) === 120)

  }
}
