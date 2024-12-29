//Person class
public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final boolean genderBool;

    public Person(String name, String surname, int age, boolean genderBool ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.genderBool = genderBool;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String toString() {
        return "Hi, I am "+name+" "+surname+" a " +age+ "-year-old " +(genderBool? "male": "female")+".";
    }
}