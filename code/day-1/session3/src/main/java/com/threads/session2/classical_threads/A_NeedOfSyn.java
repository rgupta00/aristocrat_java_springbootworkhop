package com.threads.session2.classical_threads;//package com.threads.session2.classical_threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Printer {
   private Lock lock=new ReentrantLock(true);

	public  void  print(String letter) {
        //
         ///
		try{
            lock.lock();
            System.out.print("[");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(letter+"]");
        }finally {
            lock.unlock();
        }


            //
         ///
    }
}

class Client implements Runnable{
	private String letter;

	private Printer printer;

	private Thread thread;
	public Client(String letter, Printer printer) {
		this.letter = letter;
		this.printer = printer;
		this.thread = new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		printer.print(letter);
	}
}

public class A_NeedOfSyn {
	public static void main(String[] args) {

        Printer printer = new Printer();
        Client raj = new Client("i love java", printer);
        Client ekta = new Client("i love cooking", printer);
        Client gunika = new Client("i love maths", printer);

    }
}

