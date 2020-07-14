package com.bouncer77.lesson_017;

/**
 * @author Ivan Kosenkov
 * Created by Ivan Kosenkov on 26.05.2020
 * lesson 018
 */
public class Test {
    // только из потока main можно вызывать новые потоки
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        myThread1.start(); // запускает новый поток и вызывает метод run

        MyThread myThread2 = new MyThread();
        myThread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();

        Thread.sleep(3000); // прервать поток на 3 секунды

        System.out.println("Hello, from main Thread");
    }
}
