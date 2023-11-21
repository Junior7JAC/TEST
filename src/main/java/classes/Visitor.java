package classes;

public interface Visitor<T> {
    T visitMessage(Message message);
    T visitConversation(Conversation conversation);
}