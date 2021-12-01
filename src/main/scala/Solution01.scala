object Solution01 extends App {
  def newString(str: String):String  = {
    val l = str.length
    if(l<2) str
    else str.substring(0,2)*4
  }
  println(newString("India"))
}
