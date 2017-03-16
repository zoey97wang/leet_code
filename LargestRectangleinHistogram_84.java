package leetcode;

import java.util.Stack;

public class LargestRectangleinHistogram_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int largestRectangleAreaStack(int[] heights) {
        int max = 0;
        Stack<Integer> ws = new Stack<Integer>();
        int length = heights.length;
        for(int i=0;i<=length;i++){
            int post = i==length?-1:heights[i];
            while(!ws.empty()&&post<heights[ws.peek()]){
                int h = heights[ws.pop()];
                int w = ws.empty()?i:i-ws.peek()-1;
                max = Math.max(max,h*w);
            }
            ws.push(i);
        }
        return max;
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
