package school;

import java.util.Date;

/**
 * Created by Formando on 12/05/2017.
 */
public class Employee extends Person {
    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
