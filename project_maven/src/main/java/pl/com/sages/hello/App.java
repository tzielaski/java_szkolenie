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

        int cnt=0;
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


        char[][] painting = new char[8][8];
//        fill the table
        for(int i=0; i<8;i++){
            if(i==0){
                for(int j=0; j<8;j++){
                    painting[i][j]='*';
                    System.out.print(painting[i][j]);
                }
                System.out.print("\n");
            } else if (i==7){
                for(int j=0; j<8;j++){
                    if(j==3 || j==4){
                        painting[i][j]='|';
                    }else {painting[i][j]='*';}
                    System.out.print(painting[i][j]);
                }
                System.out.print("\n");
            } else if(i%2 == 1){
                for(int j=0; j<8;j++){
                    switch(j){
                        case 3: painting[i][j]='/'; break;
                        case 4: painting[i][j]='\\'; break;
                        default: painting[i][j]='*'; break;
                    }
                    System.out.print(painting[i][j]);
                }
                System.out.print("\n");
            }else if(i%2 == 0){
                for(int j=0; j<8;j++){
                    switch(j){
                        case 2: painting[i][j]='/'; break;
                        case 3: painting[i][j]='_'; break;
                        case 4: painting[i][j]='_'; break;
                        case 5: painting[i][j]='\\'; break;
                        default: painting[i][j]='*'; break;
                    }
                    System.out.print(painting[i][j]);
                }
                System.out.print("\n");
            }
        }



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
