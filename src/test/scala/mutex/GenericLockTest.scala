package mutex

import java.util.concurrent.locks.Lock

import org.scalatest.{FunSpec, Matchers}
import util.ThreadID

/**
  * @author Ilya Sergey
  */
trait GenericLockTest extends FunSpec with Matchers {
  val THREADS = 2
  val COUNT = 1024
  val PER_THREAD = COUNT / THREADS
  var counter: Int = 0
  
  def makeLockInstance: Lock 
  val lockInstance = makeLockInstance

  describe(s"Two parallel threads with ${lockInstance.getClass.getName}") {
    it("should be mutually exclusive") {
      ThreadID.reset()

      val thread = Array.fill(THREADS)(new MyThread(lockInstance))

      for (i <- 0 until THREADS) {
        thread(i).start()
      }

      // What is heppening here?
      for (i <- 0 until THREADS) {
        thread(i).join()
      }

      // What can we assert about the counter?
      assert(true)
    }
  }

  class MyThread(lockInstance: Lock) extends Thread {
    override def run(): Unit = {
      for (i <- 0 until PER_THREAD) {
        // TODO: What should I do?
      }
    }
  }

}
