import java.util.Calendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    public String fullName() {
        String fullName = getFirstName() + " " + getLastName();
        return fullName;
    }

    public String formalName() {
        String formalName = getTitle() + " " + getFirstName() + " " + getLastName();
        return formalName;
    }

    public String getAge(){
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int age = year - getYOB();
        String stringAge = Integer.toString(age);
        return stringAge;
    }

    public String getAge(int year){
        Scanner in = new Scanner(System.in);
        int age = year - getYOB();
        String stringAge = Integer.toString(age);
        return stringAge;
    }

    public String toCSV()
    {

    }
}
