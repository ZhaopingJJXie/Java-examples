package ocp.concurrent;

import java.util.concurrent.*;

public class LinkedTransferQueueDemo{
  public static void main(String[] args){
    TransferQueue<Integer> tq =
      new LinkedTransferQueue<>();
      boolean b1 = tq.add(1);//return true, unbounded
      tq.put(2); //insert the element at the tail of the queue, return void
      boolean b3 = tq.offer(3);//insert at the tail and return true, since it's unbouded
      boolean b4 = tq.offer(4, 20, MILLISECONDS);
      tq.transfer(5);//block until this element is consumed, return void
      boolean b6 = tq.tryTransfer(6);//returns true is consumed by an awaiting threads
      // ot returns false if there was no awaiting consumer without enqueing the element
      boolean b7 = tq.tryTransfer(7, 10, MILLISECONDS);//returns true if consumed by an awaiting
      // consumer, else insert it to the tail of the queue and wait until time elapses.
      // return true if sucessful, or false if the specific time elapses,
      // in which case the element is not enqueued 


  }
}
