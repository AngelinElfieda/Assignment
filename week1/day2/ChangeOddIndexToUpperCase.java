package week1.day2;

public class ChangeOddIndexToUpperCase {
	
	public static void changeOddIndex() {
		
		String test ="changeme";
		char[] ch = new char[test.length()];
		for(int i=0;i<test.length();i++) {
			if(i%2!=0) {
				ch[i] =Character.toUpperCase(test.charAt(i)) ;
			}
			else {
				ch[i]=test.charAt(i);
			}
		}
		System.out.print(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
changeOddIndex();
	}

}
