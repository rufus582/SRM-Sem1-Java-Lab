import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_11_Hashtable {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();

        balance.put("Per1", 1000.23);
        balance.put("Per2", 235.75);
        balance.put("Per3", 3750.127);

        Enumeration<String> eNum = balance.keys();
        String str;

        while (eNum.hasMoreElements()) {
            str = eNum.nextElement();
            System.out.println(str+" "+balance.get(str));
        }
    }
}
