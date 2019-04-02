import java.util.ArrayList;

public class MExceptionMultiVersion2
{

    public void method1 ()
    {
        try {
            ArrayList l = new ArrayList(10);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println ("here 2");
            throw new IndexOutOfBoundsException();
        }
        finally {
            System.out.println ("here I am");
            //throw new IllegalArgumentException();
        }
        System.out.println ("here 4");
    }
    public static void main(String[] args)  {
        MExceptionMultiVersion2 example = new MExceptionMultiVersion2();

        try {
            example.method1();
            System.out.println ("I am after the method");
        }
        catch (NumberFormatException e) {
            System.out.println ("here A");
            throw new IllegalArgumentException();
        }
        catch (Exception e) {
            System.out.println ("here 81");
        }
        System.out.println ("Here at the end of it all!!!");
    }

}
















