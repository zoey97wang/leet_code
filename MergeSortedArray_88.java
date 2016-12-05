package leetcode;

public class MergeSortedArray_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 ={1,0};
		int[] a2 = {2};
		merge(a1,1,a2,1);
		for(int i =0;i<a1.length;i++)
		System.out.println(a1[i]);
		
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
       
		while(n>0){
			nums1[m+n-1] = (m==0 || nums1[m-1]<nums2[n-1]) ? nums2[--n]:nums1[--m];
		}
    }
	
}
