package demo;

public class ThreeInteger {

	public static void main(String[] args) {
		
		int i,j,k;
		
		int arr[] = {2,-1,4,-6,7,-2,0};
		
		for (i = 0; i < arr.length-2; i++) {
			for (j = i+1; j < arr.length-1; j++) {
				for (k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k] == 0) {
						System.out.println("["+arr[i]+ ", " + arr[j] +", "+ arr[k]+"]");
					}
				}
			}
		}
	}

}
