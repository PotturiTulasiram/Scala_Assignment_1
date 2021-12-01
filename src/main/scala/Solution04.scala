object Solution04 extends App {

  def ifString(str:String):String = {
    if(str.startsWith("If")) str
    else "If"+str
  }
  println(ifString("Ifscala"))
  println(ifString("Scala"))

}
