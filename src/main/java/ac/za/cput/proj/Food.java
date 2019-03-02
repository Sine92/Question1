package ac.za.cput.proj;
import java.util.*;

public class Food  {


private String title;

public Set<String> getSet()
{
    Set<String> set = new HashSet<>();
    set.add("Rice");
    set.add("Pumkin");
    set.add("Samp");
    set.add("Maize");
    return set;

}
public List<String> getList(){

    List<String> list = new LinkedList<>();
    list.add("Bread");
    list.add("Garlic");
    list.add("carrots");

    return list;
}

public Map<String, String> getMap(){

    Map<String , String > map = new HashMap<>();
    map.put("Sausage", "boy");
    map.put("lamp", "girl");
    map.put("mutton","mother");

    return map;

}

public Collection<String> getCollection ()
{
    Collection<String> collect = new ArrayList<>();
    ((ArrayList<String>) collect).add("Banana");
    collect.add("Apple");
    collect.add("Pineapple");
    collect.add("Grapes");
    return collect;
}



}
