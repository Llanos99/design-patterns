public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    /* This is the FACTORY METHOD. Abstract values must override */
    public abstract Message createMessage();

}
