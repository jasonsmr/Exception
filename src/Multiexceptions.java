import java.util.ArrayList;

public class Multiexceptions {
    public void method1 ()
    {
        try {
            ArrayList l = new ArrayList(-10);
            System.out.print("A ");
            Object i = l.get(1);
            System.out.print("B ");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.print ("1 ");
        }
        catch (ArithmeticException e) {
            System.out.print ("2 ");
        }
        catch (Throwable e) {
            System.out.print ("3 ");
            throw e;
        }
        finally {
            System.out.print ("4 ");
        }
    }
    public static void main(String[] args)  {
        try {
            Multiexceptions q = new Multiexceptions();
            q.method1();
            System.out.print ("5 ");
        }
        catch (RuntimeException e) {
            System.out.print ("6 ");
        }
        catch (Exception e) {
            System.out.print ("7 ");
        }
        catch (Throwable e) {
            System.out.print ("8 ");
        }
        System.out.print ("9 ");
    }
}
















