package Leetcode.may24;

public class May1_2000 {

	public static void main(String[] args) {
		String word = "abcdefd";
		May1_2000 obj = new May1_2000();
		System.out.println(obj.reversePrefix(word, 'd'));
	}
	
    public String reversePrefix(String word, char ch) {
        int chIdx = word.indexOf(ch);
        if(chIdx == -1)
        	return word;
        StringBuilder sb = new StringBuilder();
        sb.append(word.substring(0, chIdx+1));
        sb.reverse().append(word.substring(chIdx+1));
        return sb.toString();
    }

}
//EASY
