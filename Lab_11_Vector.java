import java.util.Enumeration;
import java.util.Vector;

/**
 * Lab_11_Vector
 */
public class Lab_11_Vector {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        System.out.println("Capacity after 3 additions: "+v.capacity());
        v.addElement(4);
        v.addElement(5);
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(9);
        v.addElement(10);
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("First: "+v.firstElement());
        System.out.println("Last: " + v.lastElement());

        if (v.contains(3)) {
            System.out.println("Contains 3");
        }

        Enumeration<Integer> vEnum = v.elements();
        while(vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement()+" ");
        }
    }
}