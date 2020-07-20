package lab4;

import java.util.Arrays;

public class BubbleSort1  {
	public int[] sort(int array[]){
		boolean swappedOnPrevRun = true;
		while(swappedOnPrevRun){		
			swappedOnPrevRun = false;			
			for(int i = 0; i < array.length - 1; i++)	{
				if(array[i] > array[i + 1])	{						
					swappedOnPrevRun = true;	
					int temp = array[i];		
					array[i] = array[i + 1];	
					array[i + 1] = temp;		
				}
			}
		}
		return array;
	}
	public static void main(String[] args){

		int[] scenario = {1,134,14,-25, 31, 45, 98};
		BubbleSort1 bs = new BubbleSort1();
		
		System.out.println(Arrays.toString(bs.sort(scenario)));

		int max = Integer.MAX_VALUE;
		int by = (int)Math.ceil(Math.cbrt(max));
		System.out.println(by);
		
	}

}