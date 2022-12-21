import java.util.Scanner;

public class PersonWithGEtSet {


    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your millati: ");
        String millati = scanner.nextLine();


        person.setName(name);
        person.setSurname(surname);
        person.setAge(age);
        person.setMillati(millati);
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        System.out.println(person.getMillati());

    }
    private String name;
    private String surname;
    private int age;
    private String millati;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setMillati(String millati) {
        this.millati = millati;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    public String getMillaiti() {
        return millati;
    }
}
