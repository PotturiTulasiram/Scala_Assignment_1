object Solution07 extends App {

  def happyStringorNot(str:String,n:Int): String = {
    val l = str.length
    if(n>=0 && n<l) {
      if(n==l-1) {
        if(str.charAt(n) == str.charAt(n-1)) "Happy"
        else "Not Happy"
      }
      else if(n == 0){
        if(str.charAt(n) == str.charAt(n+1)) "Happy"
        else "Not Happy"
      }
      else if (str.charAt(n) == str.charAt(n - 1) || str.charAt(n) == str.charAt(n + 1)) "Happy"
      else "Not Happy"
    }
    else "Please provide Valid Index"
  }

  println(happyStringorNot("Potturi",6))
  println(happyStringorNot("Potturi",7))

}
