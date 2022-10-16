import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Soldier> soldiers = new ArrayList<>();
        soldiers.add(new Soldier(167));
        soldiers.add(new Soldier(160));
        soldiers.add(new Soldier(170));
        soldiers.add(new Soldier(175));
        soldiers.add(new Soldier(173));
        System.out.println(soldiers);
        Collections.sort(soldiers);
        System.out.println(soldiers);


    }
}
