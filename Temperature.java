package Programs;

import java.util.TreeMap;
import java.util.Map;

public class Temperature {
public static void main(String[] args) {
	String country[]={"Arsenal","Liverpool","Manchester_U","Newcastle","Leeds"};
	int forT[]={79,67,87,74,53};
    int againstT[]={36,30,45,52,37};
    int difference[]=new int [5];
    
    for(int i=0;i<5;i++)
    {
    	difference[i]=forT[i]-againstT[i];
        System.out.println(difference[i]);
    }

    Map map=new TreeMap<String,String>();
    map.put(country, difference);
    
    
    

}
}
