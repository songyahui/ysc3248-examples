package concurrent

import scala.reflect.ClassTag

/**
  * @author Ilya Sergey
  */
class LockFreeQueue[T: ClassTag](val capacity: Int) extends MyQueue[T] {

  @volatile
  private var head, tail: Int = 0
  private val items = new Array[T](capacity)

  def enq(x: T): Unit = {
    if (tail - head == items.length) {
      throw FullException
    }
    items(tail % items.length) = x
    tail = tail + 1
  }

  def deq(): T = {
    if (tail == head) {
      throw EmptyException
    }
    val x = items(head % items.length)
    head = head + 1
    x
  }
}
