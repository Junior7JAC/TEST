package services;

import jakarta.servlet.http.PushBuilder;
import classes.Conversation;
import classes.Message;
import classes.Visitor;

public class RenderContent implements Visitor<Void> {
    @Override
    public Void visitMessage(Message message) {
        message.print();
        return null;
    }

    public Void visitConversation(Conversation conversation){
        conversation.print();
        return  null;
    }
}