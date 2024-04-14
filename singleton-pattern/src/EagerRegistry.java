public class EagerRegistry {

    /* Default constructor is private */
    private EagerRegistry(){}

    /* This is a field of the class itself no of it's instantiations */
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    /* Public method to get the instance */
    public static EagerRegistry getInstance() {
        return INSTANCE;
    }

}
