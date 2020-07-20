package lab2.problem3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Problem8 {

	public static int[] RandomArray(int n){
		int[] result = new int[n];
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++){
			int key;
			do{
				key= new Random().nextInt(n);				
			}while( map.containsKey(key));
			map.put(key, 0);
			result[i] = key;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(RandomArray(5)));
		System.out.println(Arrays.toString(RandomArray(50)));

	}

}