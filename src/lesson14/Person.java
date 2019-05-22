package lesson14;

public class Person {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgePersonExeption {
        if (age < 0 || age > 150) {
        throw new AgePersonExeption("age < 0 || age > 150");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        this.age = age;
        this.name = name;
    }
}
