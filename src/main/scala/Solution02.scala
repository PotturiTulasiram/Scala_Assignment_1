object Solution02 extends App {

  def removeChar(str:String,n:Int) :String = {
    val l = str.length
    println(l)
    if(n>=0 && n<l) str.substring(0,n)+str.substring(n+1,l)
    else "Please Provide proper Index"
  }
  println(removeChar("Scala",2))

}
