import java.util.ArrayList;

public class TestRuner {
    public static void main(String[] args) {

        // obj creat
        // reference       object;
        Animal a = new Animal();
        a.age = 3;
        //a.name = "eight";
        a.run();
        a.speak();

        Rabbit R1 = new Rabbit();
        R1.run();

        ArrayList<Animal> animals  = new ArrayList<>();



    }
}
