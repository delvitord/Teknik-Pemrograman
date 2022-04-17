package exercise3;

public abstract class Sortable {
	public abstract int compare(Sortable b);
	 public static void shell_sort(Sortable[] a){ 
		 int i, j;         
		 Sortable temp;         
		 for(i=0 ; i<a.length-1; i++){             
			 for(j=0 ; j<a.length-i-1; j++){                 
				 if(a[j].compare(a[j+1])>0){                     
					 temp = a[j+1];                     
					 a[j+1] = a[j];                     
					 a[j]= temp;                 
				}             
			}         
		}
	 }

}
