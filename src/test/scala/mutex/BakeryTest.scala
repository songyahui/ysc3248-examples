package mutex

/**
  * @author Ilya Sergey
  */
class BakeryTest extends GenericLockTest {

  override val COUNT = 1024

  override def makeLockInstance = new BakeryLock(THREADS)
}

