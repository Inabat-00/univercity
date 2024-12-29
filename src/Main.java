import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
//Main class
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fileStudents =new File("student.txt");
        File fileTeachers =new File("teacher.txt");
        Scanner scanner=new Scanner(fileStudents);
        Scanner scanner2=new Scanner(fileTeachers);
        Univercity univercity=new Univercity();

        try {
            while (scanner.hasNextLine()) {
                String name = scanner.next();
                String surname = scanner.next();
                int age = Integer.parseInt(scanner.next());
                String gender = scanner.next();
                boolean genderBool;
                genderBool = gender.equals("Male");
                Student student = new Student(name, surname, age, genderBool);
                while (scanner.hasNextInt()) {
                    student.addGrade(Integer.parseInt(scanner.next()));
                }
                univercity.addMember(student);
            }

        }catch(NoSuchElementException e){
            System.out.println("Input is missing.");
        }


        try {
            while (scanner2.hasNextLine()) {
                String name = scanner2.next();
                String surname = scanner2.next();
                int age = Integer.parseInt(scanner2.next());
                String gender = scanner2.next();
                String subject = scanner2.next();
                int yearsOfExperience = Integer.parseInt(scanner2.next());
                int salary = Integer.parseInt(scanner2.next());
                boolean genderBool;
                genderBool = gender.equals("Male");
                Teacher teacher = new Teacher(name, surname, age, genderBool, subject, yearsOfExperience, salary);
                univercity.addMember(teacher);
            }
        }catch(NoSuchElementException e){
            System.out.println("Input is missing.");
        }


        for (Person person: univercity.getMembers()) {
            if (person instanceof Student student) {
                System.out.println(student.getName() + "'s GPA: " + String.format("%2f", student.calculateGpa()));
            }
            if (person instanceof Teacher teacher) {
                if(teacher.getYearOfExperience() > 10) {
                    System.out.println(teacher.getName() + "'s salary before rise: " + teacher.getSalary() + "." + "After the rise: " + teacher.giveRaise(20));

                }
            }
        }

        univercity.sortMembers();
        System.out.println("\nThe list of people who work or study at the school:");
        univercity.print();
    }
}
