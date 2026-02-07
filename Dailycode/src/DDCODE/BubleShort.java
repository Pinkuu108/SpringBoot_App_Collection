package DDCODE;

public class BubleShort {

	public static void main(String[] args)

	{
      int a[]= {22,7,31,90,0,17,46};
      for(int i=0;i<a.length;i++)
      {
    	  int temp=0;
    	  int flag=0;
    	  for(int j=0;j<a.length-1-1;j++)
    	  {
    		  
    		  if(a[j]>a[j+1])
    		  {
    			  temp=a[j];
    			  a[j]=a[j+1];
    			  a[j+1]=temp;
    			  flag=1;
    		  }
    		 
    	  }
    	  if(flag==0)
		  {
			  break;
		  }
    	  
    	 
      }
      for(int i1=0;i1<a.length;i1++)
	  {
		  System.out.print(a[i1]+" ");
	  }
	}

}
// bubble short means is shortingh bright to left