/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy2;


enum DonaldStrategy{
    FIRST{
        public void run(){
        System.out.println("First");
        }
    },
    
    SECOND {
        public void run(){
        System.out.println("Second");
        }
    },
    
    THIRD {
        public void run(){
        System.out.println("Third");
        }
    };
    abstract public void run();
}
