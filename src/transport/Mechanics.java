package transport;

import java.util.List;

public class Mechanics {
    private String name;
    private String company;
    public void carryOutMaintenance() {}
    public void fixTheCar() {}

    public Mechanics(String name, String company)  {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик: " + name + ", " +
                "Компания: " + company;
    }
}
