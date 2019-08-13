package intro

/**
  * @author Ilya Sergey
  */
object PrimeNumbersSequential extends PrimePrinter {
  
  override def primePrint(powerOfTen: Int): Unit = {
    val limit = math.pow(10, powerOfTen).intValue
    for (j <- 1 to limit) {
      if (PrimeNumbers.isPrime(j)) {
        println(j)
      }
    }
  }

}
