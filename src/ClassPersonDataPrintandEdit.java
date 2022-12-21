public class ClassPersonDataPrintandEdit {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setSurname("Doe");
        person.setAge(25);
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

    }


}
