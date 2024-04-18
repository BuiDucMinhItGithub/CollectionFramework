package org.example.thread;

public class ThreadXX implements Runnable{
    @Override
    public void run() {
        System.out.println("ThreadXX run");
    }

    public static void main(String[] args) {
        ThreadXX threadXX = new ThreadXX();
        threadXX.run();

    }
}
