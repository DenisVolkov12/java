package lesson14;

public class Main4 {
    public static void main(String[] args) throws AgePersonExeption {
        Person person = new Person();
        person.setName("Ivan");
        try {
            person.setAge(034);
        } catch (AgePersonExeption e){
            System.out.println(e.getMessage());
        }
        System.out.println(person);
    }
}
