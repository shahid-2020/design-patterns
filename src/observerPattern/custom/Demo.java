package observerPattern.custom;

public class Demo {
    public static void main(String[] args){
        Publisher pub = new Publisher();

        Subscriber sub1 = new Subscriber("sub1");
        Subscriber sub2 = new Subscriber("sub2");

        pub.register(sub1);
        pub.register(sub2);

        sub1.registerSubject(pub);
        sub2.registerSubject(pub);

        pub.publish("New Message 1");

        pub.unregister(sub2);
        sub2.unregisterSubject();
        pub.publish("New Message 2");
    }
}
