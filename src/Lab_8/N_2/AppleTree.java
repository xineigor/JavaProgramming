package Lab_8.N_2;

public class AppleTree {
    private String sort;
    private int age;

    public AppleTree(String sort, int age) {
        if (sort != null && sort.length() >= 3) this.sort = sort;
        else throw new Error("The length of the variety/name empty or shorter than 3 characters");
        if (age >= 0) this.age = age;
        else throw new Error("Age is negative");
    }

    private int getProductivity() {
        if ((age >= 8) && (age % 2 == 0)) {
            return 50;
        }

        if (age < 8){
            return 0;
        }

        return 75;
    }

    public void addOneYear() {
        this.age++;
    }

    public String getInfo() {
        return sort + " gives " + getProductivity() + " kg of Apples per year";
    }
}
