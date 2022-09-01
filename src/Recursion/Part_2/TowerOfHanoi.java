package Recursion.Part_2;

public class TowerOfHanoi {


    public static void towerOfHanoi(int n,char from,char to,char aux)
    {
        if(n == 0 ) return;

        towerOfHanoi(n-1,from,aux,to);
        System.out.println("Move " + n+" From " + from+" To " +to);
        towerOfHanoi(n-1,aux,to,from);
    }
    public static void main(String[] args) {

        towerOfHanoi(3,'A','C','B');

    }


}