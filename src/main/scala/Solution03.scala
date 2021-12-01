object Solution03 extends App {

  def addlastchar(str: String):String = {
    val l = str.length
    val newString:String = str.charAt(l-1)+str+str.charAt(l-1)
    newString
  }

  println(addlastchar("Scala"))
}
