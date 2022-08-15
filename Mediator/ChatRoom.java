package Mediator;

import java.util.HashMap;

public class ChatRoom {
    private HashMap<String, MedUser> users;

    public ChatRoom() {
        this.users = new HashMap<String, MedUser>();
    }

    public void addParticipant(MedUser user) {
        this.users.put(user.getName(), user);
    }

    public void sendMessage(MedUser sender, MedUser receiver, String message){
        if(this.users.get(sender.getName()) != null
                && this.users.get(receiver.getName()) != null) {
            message = "From: " + sender.getName() + " message: " + message;
            receiver.receiveMessage(message);
        }
    }
}
