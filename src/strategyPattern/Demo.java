package strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter the first value");
        float a = Float.parseFloat(br.readLine());
        System.out.println("Enter the second value");
        float b = Float.parseFloat(br.readLine());

        Context additionContext = new Context(new Addition());
        System.out.println("Addition = " + additionContext.executeStrategy(a, b));

        Context subtarctionContext = new Context(new Subtraction());
        System.out.println("Subtraction = " + subtarctionContext.executeStrategy(a, b));
    }
}
