
public class Employee extends Person{
    private int id;
    private static int id_gen=1;
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Employee(){
        id=id_gen++;
    }
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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



    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount();
    }


    @Override
    public String toString() {
        String salaryInfo = String.format("earns %.2f tenge", getSalary());
        return "Employee: " +super.toString() + " " + salaryInfo ;
    }

    @Override
    public int compareTo(Person o) {
        if (o instanceof Employee) {
            Employee other = (Employee) o;
            return Double.compare(this.getSalary(), other.getSalary());
        }
        return super.compareTo(o);
    }}





