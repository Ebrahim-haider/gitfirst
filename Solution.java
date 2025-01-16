//{ Driver Code Starts
// Initial Template for Java

public class Solution{

    public static void main(String[] args) throws Exception {
        int arr[]={1,3,4,1,3,1,1,1};
        int x=minJumps(arr);
        System.out.println(x);
    }

// } Driver Code Ends

    static int minJumps(int[] arr) {
        // code here
        int c=0;
        int steps=0;
        while(arr[c]!=0)
        {
            if(c+arr[c]>=arr.length-1)
            {
                steps++;
                return steps;
            }
            int mc=c+1;
            for(int i=2;i<=arr[c];i++)
            {
                if(arr[c+i]+c+i>arr[mc]+mc)
                {
                    mc=c+i;
                }
            }
            steps++;
            c=mc;
        }
        return -1;
    }
}