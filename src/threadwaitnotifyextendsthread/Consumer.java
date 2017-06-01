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
public class Consumer extends Thread{
    Resource s;
    
    
    Consumer(Resource r){
        
        super("Consumer");
        s=r;
    }

    @Override
    public void run() {
        int i;
        do{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            i=s.consume();
        }while(i!=5);
        System.out.println("Consumer Terminating");
    }    
}
