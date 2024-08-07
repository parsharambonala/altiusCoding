import java.util.*;

class arrayKpos
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        System.out.println("Enter number of positions to rotate k:");
        int k=sc.nextInt();
        k=k%n;
            reverse(a,0,n-1);
            reverse(a,0,k-1);
            reverse(a,k,n-1);
        System.out.println("Array after rotating k positions:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void reverse(int[] a,int i,int j)
    {
        while(i<=j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }


    //Explanation
    /* Here first i rotated array for n-1 positions and then k rotated remaining elements.
     * Next I rotated the entire array so that the array will be rotated for k positions
     * 
     * Edge Cases: if k>=n then i made k=k%n
     */

}