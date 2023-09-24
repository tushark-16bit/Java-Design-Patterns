package SingletonPattern;

public class ThreadSafeSingleton {

    /**
     * This object is also lazily-initiated
     */
    public static ThreadSafeSingleton uniqueSingleton;

    private ThreadSafeSingleton() {}

    /**
     * This method guarantees that only one instance is created for the class
     * and is Thread-Safe, as if multiple threads try to create an instance,
     * they will be synchronized.
     * But has a performance impact on runtime due to waiting time
     * @return Singleton
     */
    public synchronized ThreadSafeSingleton getInstance() {
        if (uniqueSingleton==null) {
            uniqueSingleton = new ThreadSafeSingleton();
        }
        return uniqueSingleton;
    }
}
