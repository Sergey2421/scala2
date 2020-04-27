import scala.annotation.tailrec

object task1 {
  def main(args: Array[String]): Unit = {
    val array = Array(1,2,3,4,5,6,7,8,9,20,25,23,24,29,34,28,1,2,3,4,5,6,47,5)
    val result = array.indexOf(3)
    println(result)
    println(indexOFRec(3, array))
  }

  def indexOFRec(a: Int, array: Array[Int]): Int = {
    @tailrec
    def find(a: Int, array: Array[Int], i: Int): Int = {

      if (i == array.length) 0
      else if (array(i).equals(a)) {
        i
      } else find(a, array, i + 1)
    }
    find(a, array, 0)
  }
}
