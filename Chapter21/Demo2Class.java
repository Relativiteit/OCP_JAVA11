// Class.forName()

public class Demo2Class {
    public static void main(String[] args) throws Exception
    {
        Class.forName("Pqr");

    }
}


class Pqr
{
    static
    {
        System.out.println("in Static ");
    }


    // instance
    {
        System.out.println("in instance ");
    }
}