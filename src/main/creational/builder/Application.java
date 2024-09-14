package creational.builder;

public class Application {
    public static void main(String[] args) {
        URL url = new URL.Builder("https", "example.com")
                .setPath("search")
                .setQuery("q=builder+pattern")
                .setFragment("section1")
                .build();

        System.out.println(url);
    }
}
