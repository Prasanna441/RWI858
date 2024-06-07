package Arrays_Questions;

import java.util.Arrays;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr[]= {3,1,5,2,8,7,9};
		System.out.println(Arrays.toString(Arr));
		int min=999999;
		int max=-999999;
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]<min) {
				min=Arr[i];
			}
			else if(Arr[i]>max) {
				max=Arr[i];
				
			}
			
		}
		System.out.println("Min = "+ min);
		System.out.println("Max = "+ max);
		
	}

}
