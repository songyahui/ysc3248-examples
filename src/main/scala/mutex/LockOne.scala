/*
 * From "Multiprocessor Synchronization and Concurrent Data Structures",
 * by Maurice Herlihy and Nir Shavit.
 * Copyright 2006 Elsevier Inc. All rights reserved.
 * 
 * Scala version by Ilya Sergey
 */
package mutex

import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.Lock

import util.ThreadID

class LockOne extends Lock {
  
  private val flag: Array[Boolean] = new Array(2)
  
  override def lock(): Unit = {
    val i = ThreadID.get
    val j = 1 - i
    flag(i) = true
    while (flag(j)) {
      // spin
    }
  }

  override def unlock(): Unit = {
    val i = ThreadID.get
    flag(i) = false
  }

  // Any class implementing Lock must provide these methods
  override def newCondition = throw new UnsupportedOperationException

  @throws[InterruptedException]
  override def tryLock(time: Long, unit: TimeUnit) = throw new UnsupportedOperationException

  override def tryLock = throw new UnsupportedOperationException

  @throws[InterruptedException]
  override def lockInterruptibly(): Unit = {
    throw new UnsupportedOperationException
  }

}
