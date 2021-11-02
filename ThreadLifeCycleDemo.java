
//Lab-21
//Write a program to create thread life cycle.

public class ThreadLifeCycleDemo {
 public static void main(String[] args) {

  // life cycle of Thread
  // Thread's New State
  A1 threadA = new A1();
  B threadB = new B();
  // Both the above threads are in runnable state

  // Running state of thread A & B
  threadA.start();

  // Move control to another thread
  threadA.yield();
  // Blocked State of thread B
  try {
   threadA.sleep(1000);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
  threadB.start();
  System.out.println("Main Thread End");
 }
}