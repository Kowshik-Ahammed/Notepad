package Branch;

public class branchadd {
    String name;
    float cgpa;

    public branchadd(String name, float cgpa, double salary) {
        this.name = name;
        this.cgpa = cgpa;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double salary;


    public branchadd(String name, float cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
