package lesson16.blackjack;

import java.util.ArrayList;

public class Game {
    private Cards cards = new Cards();

    public void addPlayer(Player player) {
        players.add(player);
    }

    private ArrayList<Player> players = new ArrayList<>();

    public void doFirstDeal() {
        for (Player player : players) {
            Card randomCard = cards.getRandomCard();
            player.addCardToHand(randomCard);
        }

        for (Player player : players) {
            Card randomCard = cards.getRandomCard();
            player.addCardToHand(randomCard);
        }
    }

    public void doRound() {
        for (Player player : players) {
            boolean ifNeedCard = player.doAction();
            if (ifNeedCard) {
                Card randomCard = cards.getRandomCard();
                player.addCardToHand(randomCard);
            }

        }
    }

    public boolean needDoRound() {
        for (Player player : players) {
            if (player.isContinue()) {
                return true;
            }
        }
        return false;
    }

    public void printResult() {
        for (int i = 0; i < players.size(); i++){
            Player pl = players.get(i);
            System.out.println(".........................");
            System.out.println("Игрок " + i + " " + pl);
        }
    }

    public void printWinner(){

        for (Player player:players){
            if (player.getPoints() >21){
                System.out.println(player + " - проиграл");
                players.remove(player);
            }
        }
        Player winner = players.get(0);
        for (Player player: players) {
            if (player.getPoints() > winner.getPoints()){
                winner = player;
            }
        }
        players.remove(winner);

        System.out.println(winner + " - Выиграл");

        for (Player player:players) {
            System.out.println(player + " - Проиграл");
        }
    }

}
