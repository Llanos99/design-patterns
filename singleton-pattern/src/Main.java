public class Main {
    public static void main(String[] args) {

        /* registry1 and registry2 are the same instance in both eager or lazy version! */

        EagerRegistry registry1 = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();
        System.out.println(registry1 == registry2);

        LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
        LazyRegistry lazyRegistry2 = LazyRegistry.getInstance();
        System.out.println(lazyRegistry1 == lazyRegistry2);

        LazyInitializationHolderRegistry lazyInitializationHolderRegistry1 = LazyInitializationHolderRegistry.getInstance();
        LazyInitializationHolderRegistry lazyInitializationHolderRegistry2 = LazyInitializationHolderRegistry.getInstance();
        System.out.println(lazyInitializationHolderRegistry1 == lazyInitializationHolderRegistry2);

    }
}