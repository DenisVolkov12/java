package lesson16.blackjack;

import java.util.Objects;

public class Card {
    private String title;
    private int point;

    public Card() {
    }

    public String getTitle() {
        return title;
    }

    public int getPoint() {
        return point;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return title + ", " + point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return point == card.point &&
                Objects.equals(title, card.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, point);
    }

    public Card(String title, int point) {
        this.title = title;
        this.point = point;
    }
}
