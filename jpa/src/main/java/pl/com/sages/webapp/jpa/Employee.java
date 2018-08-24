package pl.com.sages.webapp.jpa;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.*;

@Entity
public class Employee {
    public Employee(){

    }

    Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    public String getName() {
        return name;
    }

    private String name;

    private String lastName;

    public long getId() {
        return id;
    }

    @Override
    public String toString(){
        return name + " " + lastName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
