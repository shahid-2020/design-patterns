package observerPattern.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class Publisher extends Observable implements Runnable {
    @Override
    public void run() {
        final BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String inp = null;
        while(inp != "exit"){
            try {
                inp = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
