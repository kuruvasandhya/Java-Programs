package JavaPrograms;

public class PangramStringExe {
	static int size=26;
	static boolean isLetter(char ch) {
		if(!Character.isLetter(ch))
			return false;
		return true;
	}
	static boolean containsAllLetters(String str,int len) {
		str=str.toLowerCase();
		boolean[] now=new boolean[size];
		for(int i=0;i<len;i++) {
			if(isLetter(str.charAt(i))) {
				int Letter=str.charAt(i)-'a';
				now[Letter]=true;
			}
		}
		for(int i=0;i<size;i++) {
			if(!now[i])
				return false;
		}
			return true;
		}

	public static void main(String[] args) {
		String str="Abcdefghijklmnopqrstuvwxyz";
		int len=str.length();
		if(containsAllLetters(str,len))
			System.out.println("The given String is a Pangram");
		else
			System.out.println("The given String is not a Pangram");

	}

}
