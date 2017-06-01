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
public class Producer extends Thread{

    Resource s;
        
    Producer(Resource r){
        
        super("Producer");
        s=r;
        
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            s.produce(i);                        
        }
        System.out.println("Producer Terminating");
    }    
}
