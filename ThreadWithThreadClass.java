package com.company;
class MyThread_one extends Thread{
    @Override
    public void run() {
        for (int i =0;i<=5;i++){
            System.out.println("Thread "+i+" is running from class MyThread_one.");
        }
        System.out.println("Exit Thread from class MyThread_one.");
    }
}
class MyThread_two extends Thread{
    @Override
    public void run() {
        for (int i =0;i<=5;i++){
            System.out.println("Thread "+i+" is running from class MyThread_two.");
        }
        System.out.println("Exit Thread from class MyThread_two.");
    }
}
class MyThread_three extends Thread{
    @Override
    public void run() {
        for (int i =0 ; i<=5;i++){
            System.out.println("Thread "+i+" is running from class MyThread_Three.");
        }
        System.out.println("Exit Thread from class MyThread_three.");
    }
}
public class ThreadWithThreadClass {
    /*
thread is small unit of processing. it is subprocess
The process of executing multiple threads simultaneously is known as multithreading.
 */
    public static void main(String[] args) {
        MyThread_one myThread_one = new MyThread_one();
        MyThread_two myThread_two = new MyThread_two();
        MyThread_three myThread_three = new MyThread_three();
        myThread_one.start();
        myThread_two.start();
        myThread_three.start();
    }
}
