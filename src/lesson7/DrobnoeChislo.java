package lesson7;

public class DrobnoeChislo {
    private int chislitel;
    private int znamenatel = 1;

    public void setChislitel (int newChislitel){
        this.chislitel = newChislitel;
    }
    public void setZnamenatel (int newZnamenatel){
        if(newZnamenatel == 0){
            System.out.println("Знаменатель не может быть 0. Повторите ввод!");
        }else {
            this.znamenatel = newZnamenatel;
        }
    }

    public int getZnamenatel(){
        return znamenatel;
    }
    public int getChislitel(){
        return chislitel;
    }
    public void prineInfo(){

        int cheloe = chislitel / znamenatel;
        int ostatok = chislitel % znamenatel;
        System.out.printf("%d %d/%d",cheloe, ostatok, znamenatel);
        System.out.println();
    }
}
