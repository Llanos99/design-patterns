public class LazyRegistry {

    private LazyRegistry() {}

    /* The variable can be modified by many threads but each change made is store in principal memory. Threads can only read/read from the principal memory */
    private static volatile LazyRegistry INSTANCE;

    /* Double-check locking */
    public static  LazyRegistry getInstance() {
        if (INSTANCE == null) {
            /* synchronized -> Only one thread can execute the block content, this avoids falling into a race conditions in multi-thread environments */
            synchronized (LazyRegistry.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistry();
                }
            }
        }
        return INSTANCE;
    }

}
