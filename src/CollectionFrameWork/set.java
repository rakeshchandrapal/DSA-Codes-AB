package CollectionFrameWork;
import java.util.*;
public class set {

    public static void main(String[] args) {
//        Random r = new Random();
//        int r1 = r.nextInt(1) ;
//        System.out.println(r1);

        Set<String> set = new HashSet<>();

        set.add("Rakesh");
        set.add("Yash");
        set.add("Yash");
        set.add("OUT");

        System.out.println(set);
    }
}