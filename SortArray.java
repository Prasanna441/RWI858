package Arrays_Questions;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[]= {2,4,1,6,9,8,3};
//		Arrays.sort(Arr);
		for(int i=0;i<Arr.length;i++) {
			for(int j=i+1;j<Arr.length;j++) {
				
				int temp;
				if(Arr[i]>Arr[j]) {
					temp=Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=temp;
							
				}
				
			}
		}
		
		System.out.println(Arrays.toString(Arr));
		
		

	}

}
