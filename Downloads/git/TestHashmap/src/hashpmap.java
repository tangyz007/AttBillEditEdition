import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashpmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<String> map = new HashMap<String>() {
			Map map= new HashMap();
			map.put("1", "Tom");
			map.put("2", "Zed");
			map.put("2", "Ted");
			map.put("z", "Quinn");
			//System.out.print(map.get("1"));
		
			System.out.println("普通的遍历方法，通过Map.keySet遍历key和value");
			for(Object temp: map.keySet()) {
				System.out.println("key= "+temp+" and value= "+map.get(temp));
			}
			
			System.out.println("通过Map.entrySet使用iterator遍历key和value：");
			Set<Map.Entry<String,String>> entry= map.entrySet();
			Iterator<Map.Entry<String,String>> i =entry.iterator();
			while(i.hasNext())
			{
//				Object temp;
//				temp=i.next();
//				System.out.println("key= "+temp+" and value= "+map.get(temp));
				Map.Entry<String,String> tempEntry = i.next();
				String key = tempEntry.getKey();
				String value = tempEntry.getValue();
				System.out.println("key= "+key+" and value= "+value);
			}
			
			
			
		}
	}


