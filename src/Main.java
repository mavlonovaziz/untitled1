import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Set<String> set =new HashSet<>();
        set.add("aaaa");
        set.add("bbbb");
        set.add("cccc");
        set.add("dddd");
        set.add("eeee");
        set.add("ffff");
        set.add("gggg");
        set.add("hhhh");
        set.add("jjjj");
        set.add("rrrr");
        Iterator<String> iterator= set.iterator();

        //   Objects.requireNonNull(set);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }





    }
}