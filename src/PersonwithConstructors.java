import java.util.Scanner;

public class PersonwithConstructors {
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



//
//        System.out.println(person.getName());
//        System.out.println(person.getSurname());
//        System.out.println(person.getAge());
    }
    private String name;
    private String surname;
    private int age;
    private String millati;

    public PersonwithConstructors(String name, String surname, int age, String millati) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public String getMillati() {
        return millati;
    }

}
