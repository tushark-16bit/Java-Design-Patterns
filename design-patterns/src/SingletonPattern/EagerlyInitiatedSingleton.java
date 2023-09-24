package SingletonPattern;

/**
 * Eagerly initiated singleton
 * Takes more memory at start of runtime but has lower performance impact
 * than synchronized singleton instantiation
 */
public class EagerlyInitiatedSingleton {

    public static EagerlyInitiatedSingleton singleton = new EagerlyInitiatedSingleton();

    private EagerlyInitiatedSingleton() {}

    /**
     * Thread-Safe operation as no conflict between two threads when method
     * called, only one object is created at start and then shared
     * @return singleton
     */
    public EagerlyInitiatedSingleton getInstance() {
        return singleton;
    }
}
