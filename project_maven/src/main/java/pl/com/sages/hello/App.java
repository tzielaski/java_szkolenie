package pl.com.sages.hello;

/**
 * Personal data
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person();
        person.setFirstName("Letitia");
        person.setLastName("Henderson");
        person.setGender("F");
        person.age=18;

        Person person2 = new Person();
        person2.setFirstName("Harold");
        person2.setLastName("Crivens");
        person2.setGender("M");
        person2.age=65;

        printData(person);
        System.out.println("*");
        printData(person2);

        System.out.println("----------------------------");
        System.out.println("Liczba osób: " + Person.count);
    }

    private static void printData(Person person){
    System.out.println("First Name: " + person.getFirstName());
    System.out.println("Last Name: " + person.getLastName());
    System.out.println("Age: " + String.valueOf(person.age));
    System.out.println("Gender: " + person.getGender());
    System.out.println("Adult: " + person.isAdult());
    System.out.println("Retired: " + person.isRetired());
}
}
