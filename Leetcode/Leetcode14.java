package Leetcode;

public class Leetcode14 {

	public static String longestCommonPrefix(String[] strs) {
		/*StringBuilder sb = new StringBuilder();
		boolean breakCalled=false;
		int j =0;
		while(true) {
			if(strs[0].length()==0 || j>strs[0].length()-1) {
				break;
			}
			char c = strs[0].charAt(j);
			for(int i=0;i<strs.length;i++) {
				if(strs[i].length()==0 || j>strs[i].length()-1 || strs[i].charAt(j)!=c) {
					breakCalled=true;
					break;
				}
			}
			if(!breakCalled) {
				sb.append(c);
				j++;
			} else {
				break;
			}
		}
		
        return sb.toString();*/
		
		StringBuilder strb = new StringBuilder();
        String shortestString = strs[0];
        for(String str : strs){
            if(str.length() < shortestString.length()){
                shortestString = str;
            }
        }
        for(String str : strs){
            if(shortestString.isEmpty()){
                break;
            }
            while(!str.startsWith(shortestString)){
                shortestString = shortestString.substring(0, shortestString.length()-1);
            }
        } 
        return shortestString; 
    }

	public static void main(String[] args) {
		String[] strs = {"flower","flow"};
		System.out.println(longestCommonPrefix(strs));
	}

}
