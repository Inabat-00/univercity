public  class Teacher extends Person{
    private final String subject;
    private final int yearOfExperience;
    private int salary;
    //Teacher class
    public Teacher(String name, String surname, int age, boolean genderPerson, String subject, int yearsOfExperience, int salary){
        super(name, surname, age, genderPerson);
        this.subject = subject;
        this.yearOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public int getYearOfExperience(){
        return yearOfExperience;
    }

    public int getSalary(){
        return salary;
    }
    public int giveRaise(int percentage){
        int increaseAmount = (percentage*salary)/100;
        salary += increaseAmount;
        return salary;
    }
    @Override
    public String toString(){
        return super.toString()+ "I teach " + subject + ".";
    }
}