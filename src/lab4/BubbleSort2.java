package lab4;

import java.util.Arrays;

public class BubbleSort2 {
	public int[] sort(int array[]){
		boolean sPrev = true;
		int len = array.length;
		int j = 1;
		while(sPrev){		
			sPrev = false;			
			for(int i = 0; i < len-j; i++)	{
				if(array[i] > array[i + 1])	{						
					sPrev = true;	
					int temp = array[i];		
					array[i] = array[i + 1];	
					array[i + 1] = temp;		
				}
			}
			j++;
		}
		return array;
	}
	public static void main(String[] args){
		int[] scenario = {1,134,14,-25, 31, 45, 98};
		BubbleSort2 bs = new BubbleSort2();
		
		System.out.println(Arrays.toString(bs.sort(scenario)));
		
	}

}
