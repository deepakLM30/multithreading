package com.company;
/*
thread is small unit of processing. it is subprocess
The process of executing multiple threads simultaneously is known as multithreading.
 */
class T_one implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<=5;i++){
            System.out.println("Thread "+i+ " is running from class T_one.");
        }
        System.out.println("Exit Thread from class T_one.");
    }
}
class T_two implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<=5;i++){
            System.out.println("Thread "+i+ " is running from class T_two.");
        }
        System.out.println("Exit thread from class T_two.");
    }
}
class T_three implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<=5;i++){
            System.out.println("Thread "+i+ " is running from class T_three.");
        }
        System.out.println("Exit thread from class T_three.");
    }
}
public class ThreadWithRunnableInterface {
    public static void main(String[] args) {
        T_one t_one = new T_one();
        T_two t_two = new T_two();
        T_three t_three = new T_three();
        Thread thread = new Thread(t_one);
        thread.start();
        Thread thread1 = new Thread(t_two);
        thread1.start();
        Thread thread2 = new Thread(t_three);
        thread2.start();
    }
}
