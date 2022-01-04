package singleton;

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // lazy loading
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
//        public static Singleton getInstance(String value) {
//        // if we use synchronized we have to make Singleton volatile
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton(value);
//                }
//            }
//        }
//        return instance;
//    }
}
