
//Human and Human1 implements the Dancer Interface

class Dancer implements Human, Human2 {


    public void Breath(String humanType) {
        System.out.println(humanType+" Can breath"); //Human
    }

    public void Sleep() {
        System.out.println("Can sleep");  //Human2
    }

    @Override
    public void Walk() {
        System.out.println("Walking");
    }
}
