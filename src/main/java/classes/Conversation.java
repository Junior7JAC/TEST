package classes;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Conversation implements Visitee {
    @Getter
    private List<Message> messageList;

    public Conversation(){
        messageList = new ArrayList<>();
    }

    public void print(){
        for (Message message: messageList) {
            message.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConversation(this);
    }
}