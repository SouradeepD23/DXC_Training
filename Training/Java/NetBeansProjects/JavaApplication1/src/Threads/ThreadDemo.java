/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author sdas301
 */
public class ThreadDemo extends Thread{
    
    @Override
    public void run(){
        System.out.println("RUN "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadDemo t=new ThreadDemo();   //Thread enters new state
        t.start();   //Thread enters runnable state after creating a new thread
        t.run();     //Executes with MAIN thread itself
        System.out.println("MAIN");
    }
}
