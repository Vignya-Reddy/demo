package JUnitDemo;

public class Calculation {

	public static int calculateMax(int arr[]){
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
		// TODO Auto-generated method stub

	}

}
