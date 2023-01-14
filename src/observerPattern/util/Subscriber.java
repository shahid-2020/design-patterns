package observerPattern.util;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            String resp = (String) arg;
            System.out.println("Received Response: " + resp );
        }
    }
}
