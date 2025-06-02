package com.threads.session1.classical_threads;
//every worker need a job
// worker : therad
//job: instance of runnable

class Job implements Runnable{
    @Override
    public void run() {
        System.out.println("job started by the thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("job end by the thread "+Thread.currentThread().getName());

    }
}
public class A_CreatingUsingThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println("start");
        Job job=new Job();
        Thread t=new Thread(job,"A");
        Thread t1=new Thread(job,"B");
        Thread t2=new Thread(job,"C");

        t.start();
        t1.start();
        t2.start();
        //join
        t.join(5000);
        t1.join();
        t2.join();

        System.out.println("end");
    }
}
