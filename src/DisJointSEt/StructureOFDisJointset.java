package DisJointSEt;

public class StructureOFDisJointset {
    public static void main(String[] args) {
        DisJointSet set = new DisJointSet(6);
        set.union(0,3);
        set.union(0,5);
        set.union(1,2);
        set.union(4,2);
        System.out.println(set.areConnected(0,4));
    }
}