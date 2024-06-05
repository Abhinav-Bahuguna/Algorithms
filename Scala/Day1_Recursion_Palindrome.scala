object Main extends App {

  def isPalindrome(str: String): Boolean = {
    if( str.size < 2 ) true
    else (str.head == str.last) && isPalindrome(str.slice(1, str.size-1))
  }

  println(s"Is ABBC Palindrome? ${isPalindrome("ABBC")}")
  println(s"Is ABBBBBA Palindrome? ${isPalindrome("ABBBBBA")}")
  println(s"Is ABABAB Palindrome? ${isPalindrome("ABABAB")}")
  println(s"Is ACBBCA Palindrome? ${isPalindrome("ACBBCA")}")
  println(s"Is A Palindrome? ${isPalindrome("A")}")

}
