package mutex

/**
  * @author Ilya Sergey
  */
class PetersonTest extends GenericLockTest {

  override val COUNT = 1024
  
  override def makeLockInstance = new PetersonLock
}
