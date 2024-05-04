package Leetcode.may24;

public class May3_165 {

	public static void main(String[] args) {
		May3_165 obj = new May3_165();
		String version1 = "1.0";
		String version2 = "1.0.1";
		System.out.println(obj.compareVersion(version1, version2));
	}
	
    public int compareVersion(String version1, String version2) {
    	String[] v1 = version1.split("\\.");
    	String[] v2 = version2.split("\\.");
    	int l1 = v1.length;
    	int l2 = v2.length;
    	for(int i=0 ; i<l1 || i<l2; i++) {
    		int n1 = i<l1 ? Integer.parseInt(v1[i]) : 0;
    		int n2 = i<l2 ? Integer.parseInt(v2[i]) : 0;
    		int c = Integer.compare(n1, n2);
    		if(c!=0)
    			return c;
    	}
        return 0;
    }

}
//MEDIUM