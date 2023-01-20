package week1.day2;

public class ReverseEvenWords {

	public static void reverse() {
		
		String text ="I am a software tester";
		String[] words = text.split(" ");
		for(int i=0;i<words.length;i++) {
			if(i%2!=0) {
				char[] word= words[i].toCharArray();
				char[] rev = new char[words[i].length()];
				for(int j=word.length-1;j>=0;j--) {
					//rev[0]=word[2], rev[1]=word[1], rev[2]=word[0]
					rev[j]=word[words[i].length()-1-j];
				}
				System.out.println(rev);
				
			} else {
				System.out.println(words[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		reverse();

	}

}
