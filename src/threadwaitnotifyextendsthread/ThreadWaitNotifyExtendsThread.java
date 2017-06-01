/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadwaitnotifyextendsthread;

/**
 *
 * @author tiago.lucas
 */
public class ThreadWaitNotifyExtendsThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Resource r = new Resource();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);
        p.start();
        c.start();
    }
    
}
