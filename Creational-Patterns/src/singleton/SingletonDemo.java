package singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        // If we see the same value, then singleton was reused.
        // If you see different values, then 2 singletons were created

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
