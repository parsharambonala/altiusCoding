import java.util.*;

class maxArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        //kadanes algorithm
        int ans=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            ans=Math.max(sum,ans); // calculates maximum contigious subrray sum
            if(sum<0)
                sum=0;
        }
        System.out.println("maximum contigious subarray sum"+ans);

        //Time complexity will be 0(n) Because here iam running through the array once
        //space complexity will be 0(n) for array

        /*Here I Calculated the contigious sum and calculated the maximum and whenever i got negative values
           The further sum cannot be maximum so, i reset sum to zero.
        */

    }
}