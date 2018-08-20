package pl.com.sages.hello;

/**
 * Personal data
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person [] personTab = new Person[3];

        personTab[0] = new Person();
        personTab[0].setFirstName("Letitia");
        personTab[0].setLastName("Henderson");
        personTab[0].setGender("F");
        personTab[0].age=18;

        personTab[1] = new Person();
        personTab[1].setFirstName("Harold");
        personTab[1].setLastName("Crivens");
        personTab[1].setGender("M");
        personTab[1].age=65;

        personTab[2] = new Person();
        personTab[2].setFirstName("Mike");
        personTab[2].setLastName("Adams");
        personTab[2].setGender("M");
        personTab[2].age=34;

        /*for (Person p: personTab){
            printData(p);
            System.out.println("*");
        }*/
        
        /*for(int i = 0; i<personTab.length;i++){
            printData(personTab[i]);
            System.out.println("*");
        }*/

//        int cnt=0;
        /*while(cnt <3){
            printData(personTab[cnt]);
            System.out.println("*");
            cnt++;
        }*/

        /*do {printData(personTab[cnt]);
            System.out.println("*");
            cnt++;} while (cnt <3);*/

        /*System.out.println("----------------------------");
        System.out.println("People count: " + Person.count);*/


        ChristmasTree christmasTree = new ChristmasTree();
        char[][] treePainting = christmasTree.getPainting();
        for (char [] row: treePainting){
            for(char square: row){
                System.out.print(square);
            }
            System.out.print("\n");
        }

        Book[] books = {new Book("The Beauty and the Beast",256),
                new Book("Infinity",100),
                new Book("Infiltration",300)};
        System.out.println("Sum of pages: " + Book.sumPageCount(books));
        System.out.println("The longest book: " + Book.getLongestBook(books).toString());



    }

    private static void printData(Person person){
    /*System.out.println("First Name: " + person.getFirstName());
    System.out.println("Last Name: " + person.getLastName());
    System.out.println("Age: " + String.valueOf(person.age));
    System.out.println("Gender: " + person.getGender());
    System.out.println("Adult: " + person.isAdult());
    System.out.println("Retired: " + person.isRetired());*/

    System.out.println(person.toString());
}
}
