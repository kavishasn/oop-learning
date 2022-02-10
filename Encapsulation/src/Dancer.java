public class Dancer {

    private String name;
    private String danceType;
    private int age;

    // To access private variables create getters and setters

    //Getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
            System.out.println("Age is set = " + age);
        } else {
            System.out.println("Invalid Age");
        }
    }

    public void setName(String name) {
        if(name == "Kavisha") {
            this.name = name;
            System.out.println("Name is set = "+name);
        }else{
            System.out.println("Incorrect Name");
        }
    }
}


class testingEncap {

    public static void main(String[] args) {
        Dancer myDancer = new Dancer();

        //Input parametere
        myDancer.setAge(24);
        myDancer.setName("Kavisha");
//        System.out.println(myDancer.getAge());

    }
}
