package me.theofrancisco;

public class FirstDuplicate {

	int firstDuplicate(int[] a) {
		 
		 for (int i=0;i<a.length;i++){
		   int p = Math.abs ( a[i] ) - 1;
		    if (a[p]<0) return Math.abs (a[i]);
		     a[p]=a[p]*-1;
		 } 
		 return -1;
		  
		  
		//This first solution, doesn't resove in time 
		// int n=-1;
		// int index=a.length;
		// for (int i=0;i<a.length-1;i++){      
		//   if (i>index) return n;
//		    for (int j=i+1;j<a.length;j++){
//		      if (j>index) break;
//		     if ((a[i]==a[j]) && (j<index)) {
//		          n=a[i];
//		          index=j;
//		         break;
//		      }      
//		      }
//		    }      
		//  return n;
		}
	
	
}
