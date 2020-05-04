package lab7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
public class HashmaptoList 
{
	public static void main(String[] args) 
	{
		List <Integer> list = new ArrayList<>();
		HashMap<String, Integer> elements = new HashMap<>();
		elements.put("one", 1);
		elements.put("four", 4);
		elements.put("two", 2);
		elements.put("three", 3);
		HashmaptoList hm = new HashmaptoList();
		list = hm.getValues(elements);
		System.out.println(list);
	}
	public static List getValues(HashMap<String,Integer> elements)
	{
		List<Integer> list = new ArrayList<>();
		Set s  = elements.entrySet();
		Iterator itr = s.iterator();
		itr = s.iterator();
		while(itr.hasNext())
		{	
			Map.Entry<String,Integer> values = (Entry<String, Integer>) itr.next();
			list.add(values.getValue());
		}
		Collections.sort(list);
		return list;
	}
}
