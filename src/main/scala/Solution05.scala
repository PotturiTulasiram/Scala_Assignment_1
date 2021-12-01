object Solution05 extends App {

  def findNeatest(x1:Int,x2:Int):Int = {
    val diff1 = (100-x1).abs
    val diff2 = (100-x2).abs

    if(diff1 == diff2 || x1 == x2) 0
    else if(diff1<diff2) x1
    else x2
  }

  println(findNeatest(80,80))
  println(findNeatest(80,120))
  println(findNeatest(34,86))
  println(findNeatest(43,102))
  println(findNeatest(132,152))

}
