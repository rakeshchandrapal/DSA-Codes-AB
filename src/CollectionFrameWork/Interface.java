package CollectionFrameWork;

import javax.lang.model.util.ElementFilter;

public class Interface {

    public static void main(String[] args) {

    }

}
class veichle{
    void start()
    {

    }
}

class Sccoty extends veichle
{
    void start()
    {

    }

}

class ElctronicVeichle
{

}


interface person
{
    void walk();
}


interface livingbeing
{
    void breathes();
}

class employee implements person,livingbeing
{
    public void walk()
    {

    }
    public void breathes()
    {}


}