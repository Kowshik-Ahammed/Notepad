package Branch;

public class branchadd {
    String name;
    float cgpa;
    int count;

    public branchadd(String name, float cgpa, int count) {
        this.name = name;
        this.cgpa = cgpa;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
