public class LazyInitializationHolderRegistry {

    private LazyInitializationHolderRegistry(){}

    /* Inner static class to store the instance itself */
    private static class RegistryHolder {
        static LazyInitializationHolderRegistry INSTANCE = new LazyInitializationHolderRegistry();
    }

    public static LazyInitializationHolderRegistry getInstance() {
        return RegistryHolder.INSTANCE;
    }

}
