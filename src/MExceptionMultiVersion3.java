import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MExceptionMultiVersion3
{

    public void method1 ()
    {
        try {
            ArrayList l = new ArrayList(-10);
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
        MExceptionMultiVersion3 example = new MExceptionMultiVersion3();

        try {
            example.method1();
//			example.method2();   // uncomment this line and you will get an error!  Why?
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


    public void method2 () throws IOException {
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        System.out.println ("How much do you weight?");
        String inputit="";

        inputit = in.readLine();

        int weight = Integer.parseInt(inputit);
    }
}

