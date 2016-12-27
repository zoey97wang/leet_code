package leetcode;

public class CompareVersionNumbers_165 {

	public static void main(String[] args){
			String s1 = "01";
			String s2 = "1.0";

		System.out.println(compareVersion(s1, s2));
	}
	
	public static int compareVersion(String version1, String version2) {
		
		int i1 = version1.indexOf(".") == -1? version1.length() : version1.indexOf(".");
		int i2 = version2.indexOf(".") == -1? version2.length() : version2.indexOf(".");;

		int s1 = Integer.parseInt(version1.substring(0,i1));
		int s2 = Integer.parseInt(version2.substring(0,i2));

		if(s1<s2)
			return -1;
		else if(s1>s2)
			return 1;
		else {
			
			if(i1 == version1.length()&&i2 == version2.length())
			{
				return 0;
			}
			else if(i1 == version1.length())
			{
				return compareVersion("0", version2.substring(i2+1));
			}
			else if(i2 == version2.length()){
				return compareVersion(version1.substring(i1+1), "0");
			}
			else{
				return compareVersion(version1.substring(i1+1), version2.substring(i2+1));
			}
			
		}		
		
    }
	
}