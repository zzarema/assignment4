import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.50));
        people.add(new Student("Paul", "McCartney", 3.00));
        Collections.sort(people);
        printData(people);
    }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.printf(  "%s  %.2f tenge\n", person, person.getPaymentAmount());
        }
        }
    }
