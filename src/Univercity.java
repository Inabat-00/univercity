import java.util.ArrayList;
import java.util.Comparator;
//University class
public class Univercity {
    private final ArrayList<Person> members;

    public Univercity() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public ArrayList<Person> getMembers() {
        return members;
    }

    public void sortMembers() {
        members.sort(Comparator.comparing(Person::getSurname));
    }

    public void print() {
        for (Person person : members) {
            System.out.println(person);

        }
    }
}