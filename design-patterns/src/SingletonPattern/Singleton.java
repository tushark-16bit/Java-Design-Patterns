package SingletonPattern;

public class Singleton {

    /**
     * This singleton is lazily initiated
     * i.e only instantiated when method called
     */
    public static Singleton uniqueSingleton;

    private Singleton() {}

    /**
     * This method guarantees that only one instance is created for the class
     * but is not Thread-safe, as multiple instances may be created the first
     * time the object is instantiated
     * @return Singleton
     */
    public Singleton getInstance() {
        if (uniqueSingleton==null) {
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }

    // Singleton can be considered as an additional utility on a class that
    // is responsible for some other behavior as well. It only guarantees
    // single object instantiation of that class
}
