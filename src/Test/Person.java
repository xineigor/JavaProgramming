package Test;


class Person {

    public static void main(String[] args) {

        Patient pt = new Patient();
        pt.method();
        Person pe = new Person();
        pe.go();
    }

    protected int weight;

    public void go () {
//        weight = 2;
        System.out.println(weight);
    }

}
class Patient extends Person {
    protected float weight;

    public void method () {
        double weight = 0.5d;
        this.weight = 0.6f;

        super.weight = 1;
        System.out.println(weight);
    }


}