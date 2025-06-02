package com.threads.session3.juc_examples.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CpuIntesiveJob implements Runnable{
    @Override
    public void run() {
        System.out.println("some cup intesive java");
    }
}

class IoIntesiveJob implements Runnable{
    @Override
    public void run() {
        System.out.println("some io intesive java");
    }
}
public class A_ThreadPool {
    public static void main(String[] args) throws Exception{

//        //for cpu intestive job no of threads == no of core in our machine
//        int noOfCors=Runtime.getRuntime().availableProcessors();
//        ExecutorService es= Executors.newFixedThreadPool(noOfCors);
//
//        for(int i=0;i<100;i++){
//            es.submit(new CpuIntesiveJob());
//        }
//        es.shutdown();
//
//        es.awaitTermination(1, TimeUnit.MINUTES);


        //for ion intestive job no of threads >>1000
//        ExecutorService es= Executors.newFixedThreadPool(1000);
//
//        for(int i=0;i<100;i++){
//            es.submit(new IoIntesiveJob());
//        }
//        es.shutdown();
//
//        es.awaitTermination(1, TimeUnit.MINUTES);

//        ExecutorService es= Executors.newFixedThreadPool(100);

//
//        es.shutdown();
//
//        es.awaitTermination(1, TimeUnit.MINUTES);

//        int noOfCors=Runtime.getRuntime().availableProcessors();
//        ExecutorService es= Executors.newFixedThreadPool(noOfCors);
//
//        for(int i=0;i<10;i++){
//            es.submit(new CpuIntesiveJob());
//        }
//
//       es.shutdown();
//
//       es.awaitTermination(1, TimeUnit.MINUTES);


    }
}
