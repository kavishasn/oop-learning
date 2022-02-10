

public class Person {

    void walk() {

        System.out.println("Human can Walking");
    }
}

class Dancer extends Person {

    String name;
    String danceType;
    int age;

    void Dance() {

        System.out.println(name+" like Dancing");
    }

    void CheckAge() {
        if (age > 18) {
            System.out.println(name + " Can Dance"+danceType);
        } else {
            System.out.println(name + " Cannot dance"+danceType);
        }
    }


}

class TestingInheritance {

        public static void main(String[] args) {


           Dancer myObjD = new Dancer();
//            System.out.println(myObjD.name);
//            myObjD.Dance();
            myObjD.walk();

            Dancer didi = new Dancer();
            didi.name = "Chamini";
            didi.age = 5;
            didi.danceType = " Western";

            didi.Dance();
            didi.CheckAge();

            Dancer kaveesha = new Dancer();
            kaveesha.name = "Kavi";
            kaveesha.age = 24;
            kaveesha.danceType = " Traditional";

            kaveesha.Dance();
            kaveesha.CheckAge();




        }

    }
