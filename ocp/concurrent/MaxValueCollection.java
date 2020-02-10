package ocp.concurrent;

import java.util.concurrent.locks.*;
import java.util.*;

public class MaxValueCollection{
  private List<Integer> integers = new ArrayList<>();
  private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

  public void add(Integer i){
    rwl.writeLock().lock();//one at one time
    try {
      integers.add(i);
    }finally{
    rwl.writeLock().unlock();
  }
  }

  public int findMax(){
    rwl.readLock();//many at one time
    try{
      return Collections.max(integers);
    }finally{
      rwl.readLock().unlock();
    }
  }
}
