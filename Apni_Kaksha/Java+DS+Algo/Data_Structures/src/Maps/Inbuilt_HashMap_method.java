/*
 * @author: Kaiwalya Koparkar
 * @date: 16/ 09/ 2020
 * In this I have Implemented the Inbuilt Hash Maps to perform
 * the tasks
 * 
 */

package Maps;
import java.util.*;

public class Inbuilt_HashMap_method {

	public static void main(String[] args) {
		
		Map<String,Integer> number = new HashMap<>();
		number.put("One", 1);
		number.put("Two", 2);
		number.put("Four", 4);
		number.put("Five", 5);
		number.put("Six", 6);
		number.put("Seven", 7);
		number.put("Eight", 8);
		
		System.out.println(number);
		//value to the key is updated
		number.put("One", 10);
		System.out.println(number);
		
		//putIfAbsent() Method - It only replaces value when it is not already present
		System.out.println(number.putIfAbsent("One",1));
		
		//get(K) Method - It returns the value associated with the key
		//if not found return null
		System.out.println(number.get("Three"));
		System.out.println(number.get("Hundred"));
		
		//getOrDefault(K, Default Value) Method - It returns the value associated with the key
		//if not found returns default value
		System.out.println(number.getOrDefault("Two",2));
		System.out.println(number.getOrDefault("Hundred",100));
		
		//containsKey() Method - It checks if the map contains the key or not
		System.out.println(number.containsKey("One"));
		
		//containsValue() Method - It checks if the map contains the value or not
		System.out.println(number.containsValue(100));
		
		//replace(K, V) Method - It replaces value of K with V
		System.out.println(number);
		number.replace("Five",500);
		System.out.println("After replacing: "+number);
		
		
	}
}