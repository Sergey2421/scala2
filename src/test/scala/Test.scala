import org.scalatest.funsuite.AnyFunSuite

class Test extends AnyFunSuite {
  test("Combos") {
    assert(task2.combos(100).equals(task2.combosRec(100)))
  }

}
