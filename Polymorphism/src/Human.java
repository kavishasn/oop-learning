

public class Human {

    //Only method we use is
    public void humanAction(){

        System.out.println("Human do actions");
    }

    public void humanAction(String name) {

    }

    public void humanAction(int age){

    }
}



class Dancer extends Human{

    //overRiding
    public void humanAction() {
        System.out.println("The action of Dancer: dancing");
    }

    //overLoading
    public void humanAction(int age) {
        System.out.println(age);
    }
}



class Runner extends Human{

    //overRiding
    public void humanAction() {
        System.out.println("The action of Runner: running");
    }

    //overLoading
    public void humanAction(String name) {
        System.out.println(name);
    }


}

   class testingPoly {

       public static void main(String[] args) {


           Human myHuman = new Human();//Human Object
           Human myDancer = new Dancer();//Dancer Object     //upcasting
           Human myRunner = new Runner();//Runner Object

           myHuman.humanAction();
           myDancer.humanAction();
           myRunner.humanAction();

           myRunner.humanAction("Kavi"); //Passing parameter
           myDancer.humanAction(10); //Passing parameter
       }
   }
