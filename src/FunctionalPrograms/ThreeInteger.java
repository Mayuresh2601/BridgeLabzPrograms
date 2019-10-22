package FunctionalPrograms;

public class ThreeInteger {

	public static void main(String[] args) {
		
		int i,j,k,count=0;
		
		int array[] = {2,-1,4,-6,7,-2,0};
		
		for (i = 0; i < array.length-2; i++) {
			for (j = i+1; j < array.length-1; j++) {
				for (k = j+1; k < array.length; k++) {
					if(array[i]+array[j]+array[k] == 0) {
						System.out.println("["+array[i]+ ", " + array[j] +", "+ array[k]+"]");
						count++;
					}
				}
			}
		}
		System.out.println("The Number of distinct Triplets are: "+count);
	}

}
