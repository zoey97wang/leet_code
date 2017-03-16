package leetcode;

public class LargestRectangleinHistogram_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int largestRectangleArea(int[] heights) {
        int max = 0;
        for(int i=0;i<heights.length;i++){
            int h = heights[i];
            int w = getLength(i,heights);
            max = Math.max(max,h*w);
        }
        return max;
    }
    public int getLength(int index, int[] array){
        int pre=0,post=0;
        int l = array.length;
        if(l<=1) return l;
        if(index != 0){
            pre = index;
            while(pre>0){
                if(array[--pre] < array[index]){
                    pre++;
                    break;
                }
            }
        }
        if(index!=l-1){
            post = index;
            while(post<l-1){
                if(array[++post] < array[index]){
                    post--;
                    break;
                }
            }
        }else{
            post=l-1;
        }
        return post-pre+1;
    }

}
