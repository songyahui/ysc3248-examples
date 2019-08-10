package intro

/**
  * @author Ilya Sergey
  */
class Counter {
  private var count = 0

  def getAndIncrement: Int = {
    val tmp = count
    count = tmp + 1
    tmp
  }
}
