package pl.com.sages.hello;

class Person {
//    Variables and setters
    static int count=0;

    int age;

    Person() {
        count++;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

     String getFirstName() {
        return firstName;
    }

     String getLastName() {
        return LastName;
    }

     String getGender() {
        return gender;
    }

    private String firstName;

     void setLastName(String lastName) {
        LastName = lastName;
    }

    private String LastName;
    private String gender;


     void setGender(String gender) {
        this.gender = gender;
    }

//  Methods
     boolean isAdult() {
        return age >= 18;
    }


     boolean isRetired() {
        if (gender.equals("M")) {
            return age >= 65;
        } else {
            return age >= 60;
        }
    }

    @Override
    public String toString(){
         return ("First name: " + firstName + "\n"
         + "Last name: " + LastName + "\n"
         + "Age: " + age + "\n"
         + "Gender: " + gender + "\n"
         + "Adult: " + isAdult() + "\n"
         + "Retired: " + isRetired());
    }

}
