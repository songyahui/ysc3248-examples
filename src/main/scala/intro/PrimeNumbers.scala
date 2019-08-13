package intro

/**
  * @author Ilya Sergey
  */
object PrimeNumbers {
  
  def isPrime(i: Int): Boolean = {
    if (i <= 1) return false
    for (j <- 2 to math.sqrt(i).intValue) {
      if (i %  j == 0) return false
    }
    true
  }

//  def main(args: Array[String]): Unit = {
//    println(isPrime(238))
//  }

}
