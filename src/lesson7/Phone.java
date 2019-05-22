package lesson7;

public class Phone {
    private double diagonal;
    private String colour;
    private int battary;
    private String name;


    public void setBattary(int Battery) {
        this.battary = Battery;
    }

    public void setDiagonal(double Diagonal) {
        this.diagonal = Diagonal;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void printInfo() {
        System.out.printf("Телефон: диагональ - %.2f дюймов, батарея %d, %s - синий, имя  - %s", diagonal, battary, colour, name);
        System.out.println();

    }
}
