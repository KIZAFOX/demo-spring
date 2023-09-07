package fr.kizafox.demospring.model;

/**
 * Change this line to a short description of the class
 *
 * @author : KIZAFOX
 * @date : 06/09/2023
 * @project : GithubCopilot
 */
public class Employee {

    private int id;
    private String name, email, country;

    public Employee(int id, String name, String email, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
