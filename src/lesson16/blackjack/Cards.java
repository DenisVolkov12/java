package lesson16.blackjack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Cards {
    ArrayList<Card> cards = new ArrayList<>();

    public Cards() {
        Card card1 = new Card("Двойка Крестовая",2);
        Card card2 = new Card("Двойка Бубновая",2);
        Card card3 = new Card("Двойка Червовая",2);
        Card card4 = new Card("Двойка Пиковая",2);

        Card card5 = new Card("Тройка Крестовая",3);
        Card card6 = new Card("Тройка Бубновая",3);
        Card card7 = new Card("Тройка Червовая",3);
        Card card8 = new Card("Тройка Пиковая",3);

        Card card9 = new Card("Четвёрка Крестовая",4);
        Card card10 = new Card("Четвёрка Бубновая",4);
        Card card11 = new Card("Четвёрка Червовая",4);
        Card card12 = new Card("Четвёрка Пиковая",4);

        Card card13 = new Card("Пятёрка Крестовая",5);
        Card card14 = new Card("Пятёрка Бубновая",5);
        Card card15 = new Card("Пятёрка Червовая",5);
        Card card16 = new Card("Пятёрка Пиковая",5);

        Card card17 = new Card("Шестёрка Крестовая",6);
        Card card18 = new Card("Шестёрка Бубновая",6);
        Card card19 = new Card("Шестёрка Червовая",6);
        Card card20 = new Card("Шестёрка Пиковая",6);

        Card card21 = new Card("Семёрка Крестовая",7);
        Card card22 = new Card("Семёрка Бубновая",7);
        Card card23 = new Card("Семёрка Червовая",7);
        Card card24 = new Card("Семёрка Пиковая",7);

        Card card25 = new Card("Восмёрка Крестовая",8);
        Card card26 = new Card("Восмёрка Бубновая",8);
        Card card27 = new Card("Восмёрка Червовая",8);
        Card card28 = new Card("Восмёрка Пиковая",8);

        Card card29 = new Card("Девятка Крестовая",9);
        Card card30 = new Card("Девятка Бубновая",9);
        Card card31 = new Card("Девятка Червовая",9);
        Card card32 = new Card("Девятка Пиковая",9);

        Card card33 = new Card("Десятка Крестовая",10);
        Card card34 = new Card("Десятка Бубновая",10);
        Card card35 = new Card("Десятка Червовая",10);
        Card card36 = new Card("Десятка Пиковая",10);

        Card card37 = new Card("Валет Крестовый",10);
        Card card38 = new Card("Валет Бубновый",10);
        Card card39 = new Card("Валет Червовый",10);
        Card card40 = new Card("Валет Пиковый",10);

        Card card41 = new Card("Дама Крестовая",10);
        Card card42 = new Card("Дама Бубновая",10);
        Card card43 = new Card("Дама Червовая",10);
        Card card44 = new Card("Дама Пиковая",10);

        Card card45 = new Card("Кароль Крестовый",10);
        Card card46 = new Card("Кароль Бубновый",10);
        Card card47 = new Card("Кароль Червовый",10);
        Card card48 = new Card("Кароль Пиковый",10);

        Card card49 = new Card("Туз Крестовый",11);
        Card card50 = new Card("Туз Бубновый",11);
        Card card51 = new Card("Туз Червовый",11);
        Card card52 = new Card("Туз Пиковый",11);

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);
        cards.add(card11);
        cards.add(card12);
        cards.add(card13);
        cards.add(card14);
        cards.add(card15);
        cards.add(card16);
        cards.add(card17);
        cards.add(card18);
        cards.add(card19);
        cards.add(card20);
        cards.add(card21);
        cards.add(card22);
        cards.add(card23);
        cards.add(card24);
        cards.add(card25);
        cards.add(card26);
        cards.add(card27);
        cards.add(card28);
        cards.add(card29);
        cards.add(card30);
        cards.add(card31);
        cards.add(card32);
        cards.add(card33);
        cards.add(card34);
        cards.add(card35);
        cards.add(card36);
        cards.add(card37);
        cards.add(card38);
        cards.add(card39);
        cards.add(card40);
        cards.add(card41);
        cards.add(card42);
        cards.add(card43);
        cards.add(card44);
        cards.add(card45);
        cards.add(card46);
        cards.add(card47);
        cards.add(card48);
        cards.add(card49);
        cards.add(card50);
        cards.add(card51);
        cards.add(card52);

    }
    public Card getRandomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 52);
        return  cards.get(randomNum);
    }
}
