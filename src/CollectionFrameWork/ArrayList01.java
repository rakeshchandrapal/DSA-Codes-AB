package CollectionFrameWork;
import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        list.add(45);
        list.add(78);
        list.add(2,466);

        System.out.println(list);

        list.set(2,455);
        list.set(0,null);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}