import javax.crypto.NullCipher;

public class Student extends Person {
    private int id;
    private static int id_gen=1;
    private String name;
    private String surname;
    private double gpa;
    public Student() {
        id=id_gen++;
    }
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        String stipendInfo = (gpa > 2.67) ? "earns" : "earns";
        return "Student: " + super.toString() + " " + stipendInfo;
    }
    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00: 0;
    }
    @Override
    public int compareTo(Person o) {
        if (o instanceof Student) {
            Student other = (Student) o;
            return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
        }
        return super.compareTo(o);
    }
}
