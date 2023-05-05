package TimeAndSpaceComplexity;
import java.util.Scanner;
public class MergeSort {

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the size of array1");
		int n = scn.nextInt();
		System.out.println("Enter the array1 elements");
		int[] arr1 = new int[n];
		for(int i = 0; i <n ; i++) {
			arr1[i] = scn.nextInt();
			}
		
		int[] arr3 = mergeSort(arr1 , 0 , arr1.length-1);
		for(int i = 0; i <arr3.length ; i++) {
			System.out.println(arr3[i]);
			}

	}
	
	public static int[] mergeSort(int[] arr , int l , int h) {
		
		int m = (l +h)/2 ;
		
		if ( l == h) { 
			int[] arrempty = new int[1] ;
			arrempty [0] = arr[l];
			return arrempty;
}
		
		int[] fsh = mergeSort(arr , l , m);                           //First sorted half array
		int[] ssh = mergeSort (arr , m+1,h);                          // Second sorted half array
		
		int [] array = mergesortedArrays(fsh , ssh);                  // Merge both these sorted arrays.
		return array;
		
	}
	
	public static int[] mergesortedArrays(int[] a , int[] b) {
		 int i = 0, j =0, k = 0;
		    int[] ans = new int[a.length + b.length];
		    while(i < a.length && j < b.length){
		        if(a[i] <= b[j]){
		          ans[k] = a[i];
		          i++;
		          k++;
		        }else{
		          ans[k] = b[j];
		          j++;
		          k++;
		        }
		    }

		    while(i < a.length){
		      ans[k] = a[i];
		      k++;
		      i++;
		    }

		    while(j < b.length){
		      ans[k] = b[j];
		      k++;
		      j++;
		    }
		    
		    return ans;
		  }
		

}
