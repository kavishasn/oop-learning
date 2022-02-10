
//Abstract class
abstract class Human {

    //does not have a body 4 abstract class
    public abstract void humanAction();


    //This is not an abstract class
    public void Sleep(String sleepState) {
        System.out.println("Sleeping " + sleepState);

    }
}

//Inheritance

class Dancer extends Human {

    public void humanAction() {
        System.out.println("Dancers action : Dancing");
    }
}

class testingAbstraction {

    public static void main(String[] args) {
        Dancer ObjDancer = new Dancer();

        ObjDancer.humanAction();
        ObjDancer.Sleep("Comfortably");
    }

}
