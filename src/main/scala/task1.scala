import scala.annotation.tailrec

object task1 {

  def main(args: Array[String]): Unit = {
    val value = args(0).toInt
    println(combos(value))
    println(combosRec(value))
  }

  def combos(sum: Int): List[String] = {
    @tailrec
    def find(a: Int, b: Int, list: List[String]): List[String] = {
      if(a <= b){
        find(a + 1, b - 1, list ::: List[String](a.toString + " + " + b.toString + " = " + sum.toString))
      } else {
        list
      }
    }

    find(1, sum - 1, Nil)
  }

  def combosRec(sum: Int): List[String] = {
    def find(a: Int, b: Int, list: List[String]): List[String] = {
      if(a <= b) List(a.toString + " + " + b.toString
        + " = " + sum.toString) ::: find(a + 1, b - 1, list)
      else
        Nil
    }
    find(1, sum - 1, Nil)
  }
}
