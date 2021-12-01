object Solution06 extends App {

  def checkRange(n1:Int,n2:Int) :Boolean = {

    if((n1<=20 && n2>=50) || (n1>=20 && n2<=50)) true
    else false

  }
  println(checkRange(40,55))
  println(checkRange(11,60))
  println(checkRange(34,44))

}
