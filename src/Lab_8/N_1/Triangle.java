package Lab_8.N_1;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getArea() {
        int n = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(n * (n - sideA) * (n - sideB) * (n - sideC));
        return (int) area;
    }

    public int getPerimetr() {
        return sideA + sideB + sideC;
    }

    public String getType() {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            sideA *= -1;
            sideB *= -1;
            sideC *= -1;
        }

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            return "Incorrect";
        }

        else if (sideA == sideB && sideB == sideC) {
            return "Equilateral";
        }

        else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Isosceles";
        }

        else if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2) || Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2) || Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2)) {
            return "Rectangular";
        }

        else {
            return "Arbitrary";
        }
    }
}
