package Oops.pt_1;

public class abstractclassusing {

    public abstract class parent{
        void hello(){
            System.out.println("HELLO !.....");
        }

        abstract void greet();
        abstract void good();
    }

    public class child extends parent{
        @Override
        void greet() {
            System.out.println("Good Morning ....");

        }

        @Override
        void good() {
            return;
        }

    }

    public abstract  class child2 extends parent{
        @Override
        void hello() {
            super.hello();
        }
    }


    public void main(String[] args) {
//        parent p = new parent(); // Not allowed
        child c = new child();
//        child2 c2 = new child2() ; // Not allowed

    }
}