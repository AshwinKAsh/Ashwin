package Programs;

public class BubbleSort1{
	 static int array[] = {12,9,4,99,120,1,3,10};
	  public static void main(String a[]){
	  int i;
	 
	  System.out.print("Values Before the sort:\n");
	  for(i = 0; i < array.length; i++)
	  System.out.print( array[i]+"  ");
	  System.out.println();
	  bubble_sort(array, array.length);
	  System.out.print("Values after the sort:\n");
	  for(i = 0; i <array.length; i++)
	  System.out.print(array[i]+"  ");
	  System.out.println(); 
	  }

	  public static void bubble_sort( int a[], int n ){
		    boolean swapped = true;
	  int i=0;
	  int j=0;
	  int temp=0;
	    while (swapped) 
	    {
	          swapped = false;
	          i++;
	          for(i = 0; i < n; i++)
	          {
	        	  for(j = 1; j < (n-i); j++)
	        	  {
	        		  if(a[j-1] > a[j])
	        		  {
	        			  temp = a[j-1];
	        			  a[j-1]=a[j];
	        			  a[j]=temp;
	        			  swapped = true; 
	        		  }
	        	  }
	          }
	    }
	  }
	}