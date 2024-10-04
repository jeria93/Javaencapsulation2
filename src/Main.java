import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animals cat = new Animals("cat", 10, "Europe");
        Animals dog = new Animals("dog", 15, "Asia");
        Animals bird = new Animals("Bird", 99, "Worldwide");


        System.out.println(cat.toString());
        System.out.println("---------------------------------------");
        System.out.println(cat.getName());
        System.out.println("---------------------------------------");
        cat.setName("Figaro");
        System.out.println(cat.getName());
        ArrayList<Animals> zoo = new ArrayList<>();
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(bird);

        for(Animals animal : zoo) {
            System.out.println(animal.toString());
        }

        System.out.println("Github testing");
        zoo.remove(bird);
        for(Animals animal : zoo) {
            System.out.println(animal.toString());
        }

        cat.textString("Figaro clone", 1);

//        Commit Window command+0 + select files to se changes.

        System.out.println("Trying new things");
        System.out.println("Newer things to come");


    }
}