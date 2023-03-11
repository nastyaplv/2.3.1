package web.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int age;

    public User() {

    }
    public User(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.surname = lastName;
        this.age = age;
    }
    public User(String name, String lastName, int age) {
        this.name = name;
        this.surname = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return surname;
    }

    public void setLastName(String lastName) {
        this.surname = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}