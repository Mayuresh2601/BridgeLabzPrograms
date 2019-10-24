package LogicalPrograms;

public class StringMatching {

	public static void main(String[] args) {
		
		String s = "AB";
		char[] ch = s.toCharArray();
		char[] str = {'A','B','B','A','B','B','A','B','A','B','A','B','B'};

		for (int i = 0; i < str.length; i++) {
			for (int j = i; j < ch.length; j++) {
				if(str[i] == ch[j] && str[i+1] == ch[j+1]) {
					System.out.println(i);
				}
			}
		}
	}

}
