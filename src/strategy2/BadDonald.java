/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy2;

/**
 *
 * @author don
 */
public class BadDonald {

    static String First = "First";
    static String Second = "Second";
    static String Third = "Third";
    static String[] all = {First, Second, Third};
    
    
    String which = First;
    
    void setWhich(String x) {
        for (String s : all) {
            if (s.equals(x)) {
                which = s;
                return;
            }
        }
        throw new RuntimeException("Unrecognizable input "+x);
    }
    
    void doit() {
        System.out.println(which);
    }
    
}
