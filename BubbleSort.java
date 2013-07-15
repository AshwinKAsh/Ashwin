package Programs;

public class BubbleSort{
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
	  int i, j,t=0;
	  for(i = 0; i < n; i++)
	  {
	  for(j = 1; j < (n-i); j++)
	  {
	  if(a[j-1] > a[j]){
		  System.out.print("a[j-1]= " +a[j-1]+" a[j]= "+a[j]+" "); 
	      t = a[j-1];
	      System.out.print("t= "+t+" ");
	      a[j-1]=a[j];
	      System.out.print("a[j-1]= "+a[j-1]+" ");
	      a[j]=t;
	  System.out.println("a[j]= "+a[j]+" ");
	  }
	  }
	  }
	  }
	}