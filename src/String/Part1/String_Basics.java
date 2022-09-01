package String.Part1;

public class String_Basics {

    public static void main(String[] args) {
        // because string is immutable in java
        String a = new String("Rakesh");
        a.concat(" Hi ");
        System.out.println(a);

        // it is string builder which is mutable
        StringBuilder b = new StringBuilder("Rasmeet");
        b.append(" helllo ");
        System.out.println(b);
    }
}