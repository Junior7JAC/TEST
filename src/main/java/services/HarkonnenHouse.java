package services;

public class HarkonnenHouse implements HouseStrategy {
    @Override
    public void printMessage(String message) {
        String decoded = "";
        for (int i = 0; i < message.length(); i++)
            decoded += (char)(message.charAt(i) - 2);

        System.out.println("Mesaj from harkonen: " + decoded);
    }
}