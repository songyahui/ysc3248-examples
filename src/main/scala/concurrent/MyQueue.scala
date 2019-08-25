package concurrent

/**
  * @author Ilya Sergey
  */
trait MyQueue[T] {

  def enq(x: T): Unit

  def deq(): T

  def toList: List[T] = {
    var l : List[T] = Nil
    try {
      while (true) {
        l = l ++ List(deq())
      }
      l // doesn't happen
    } catch {
      case EmptyException => l
    }
  }
  
}

// Exceptions
case object FullException extends Exception
case object EmptyException extends Exception
