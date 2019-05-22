package lesson12;

public class Coin implements Comparable<Coin> {
    private int year;
    private int nominal;
    private int diametr;

    public Coin() {

    }

    public Coin(int nominal, int diametr, int year) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.year = year;
    }


    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (diametr != coin.diametr) return false;
        return year == coin.year;
    }

    @Override
    public int hashCode() {
        int result = nominal;
        result = 31 * result + diametr;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", diametr=" + diametr +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        int num1 = this.nominal;
        int num2 = o.nominal;

        if (this.nominal != o.nominal){
            return o.year - this.year;
        }

        if (num1 != num2) {
            return num1 - num2;
        }

        if (this.year != o.year) {
            return o.year - this.year;
    }

        return 0;
    }
}
