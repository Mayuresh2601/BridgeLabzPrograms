package demo;

public class SecondLarge {

	public static void main(String[] args) {
		
	int [] array = {123,46,678,68,5654,52,342,3421,4253465,4342,1234,234,234,23,3423,23};
	int first = array[0];
	int second = array[0];
	for (int i = 0; i < array.length; i++) {
		
		if(array[i] > first) {
			second = first;
			first = array[i];
		}
		
		if(array[i] > second && array[i] != first) {
			second = array[i];
		}
	}
	
	System.out.println(second);
	}

}
