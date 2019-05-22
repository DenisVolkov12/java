package lesson7;

public class Chernovik {
    private String strange;
    private int intellience;
    private int fizicheskayaForma;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setStrange (String newStrange){
        this.strange = newStrange;
    }
    public void setIntellience(int Intellience){
        this.intellience = Intellience;
    }

    public void setFizicheskayaForma(int fizicheskayaForma) {
        this.fizicheskayaForma = fizicheskayaForma;
    }
    public void printInfo(){
        System.out.printf("Имя: %s\nСтранности: %s\nИнтеллект: %d\nФизическая подготовка %d", name, strange,intellience,fizicheskayaForma);
        System.out.println();
    }
}
