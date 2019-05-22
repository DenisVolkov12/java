package lesson16.blackjack;

import java.util.ArrayList;

public abstract class Player {
    protected  ArrayList<Card> hand = new ArrayList<>();
    private boolean isContinue = true;

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public void printHand(){
        System.out.println("________________________");
        System.out.println("Ваши карты:");
        for (Card card:hand) {
            System.out.println(card);
        }
        System.out.println("_________________________");
    }

    public boolean isContinue() {
        return isContinue;
    }

    public void setContinue(boolean aContinue) {
        isContinue = aContinue;
    }

    public abstract boolean doAction();

    public int getPoints(){
        int countPoints = 0;
        for (Card card : hand) {
            countPoints = countPoints + card.getPoint();
        }
        return countPoints;
    }


}
