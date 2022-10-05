package Oops.pt_1;

public class dynamic_Dispatch {

    public static class Phone{
        public  void on(){
            System.out.println("Turning on Phone....");
        }

        public  void greet(){
            System.out.println("Good Morning.......");
        }
    }

    public static class SmartPhone extends Phone{
        public  void on()
        {
            System.out.println("Turning on SmartPhone...");
        }

        public void music()
        {
            System.out.println("Playing music..");
        }
    }

    public static void main(String[] args) {
        Phone samsung = new SmartPhone();
        samsung.on();
//        samsung.music(); //is not allowed
    }
}