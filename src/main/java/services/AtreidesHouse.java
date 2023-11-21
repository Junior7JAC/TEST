package services;

public class AtreidesHouse implements HouseStrategy {
    @Override
    public void printMessage(String message) {
        String decoded = "";
        for (int i = 0; i < message.length(); i++)
            decoded += (char)(message.charAt(i) + 3);
        System.out.println("Mesaj from Atreides: " + decoded);
    }
}