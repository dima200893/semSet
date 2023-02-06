import java.util.HashMap;
import java.util.Iterator;

public class s6 {
    private static HashMap<Integer,Object> hash=new HashMap<>();
    private static final Object OBJECT=new Object();
    public static void main(String[] args)  {
        add(65);
        add(14);
        add(62);
        add(61);
        add(61);
        System.out.println(hash.keySet());
    }

    public static void add(Integer number) {
            hash.put(number,OBJECT);
    }
}
