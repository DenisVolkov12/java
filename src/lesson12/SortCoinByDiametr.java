package lesson12;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class SortCoinByDiametr implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        return 0;
    }

    @Override
    public Comparator<Coin> reversed() {
        return null;
    }

    @Override
    public Comparator<Coin> thenComparing(Comparator<? super Coin> other) {
        return null;
    }

    @Override
    public <U> Comparator<Coin> thenComparing(Function<? super Coin, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Coin> thenComparing(Function<? super Coin, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Coin> thenComparingInt(ToIntFunction<? super Coin> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Coin> thenComparingLong(ToLongFunction<? super Coin> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Coin> thenComparingDouble(ToDoubleFunction<? super Coin> keyExtractor) {
        return null;
    }
    public int compareTo(Coin o) {
        int num1 = o.getNominal();
        int num2 = o.getNominal();

        Coin o1 = null;
        if (o1.getNominal() != o.getNominal()){
            return o.getYear() - o1.getYear();
        }

        if (num1 != num2) {
            return num1 - num2;
        }

        if (o1.getYear() != o.getYear()) {
            return o.getYear() - o1.getYear();
        }

        return 0;
    }
}
