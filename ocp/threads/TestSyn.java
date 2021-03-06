package ocp.threads;
public class TestSyn extends Thread {
      static Object lock1 = new Object();
      static Object lock2 = new Object();
      static volatile int i1, i2, j1, j2, k1, k2;
      public void run() {
        while (true){
          workWithLocks();
          workWithoutLocks();
        }
      }
      void workWithLocks()
      {
        synchronized(lock1) { i1++ ;  i2++; }
        synchronized(lock2) { k1++ ; k2++ ; }
        j1++;    j2++;    }
        void workWithoutLocks()    {
          if (i1 != i2) System.out.println("i");
          if (j1 != j2) System.out.println("j");
          if (k1 != k2) System.out.println("k");
        }
          public static void main(String args[]){
            new TestSyn().start();
            new TestSyn().start();
          }
        }
