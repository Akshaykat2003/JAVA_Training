




//sort the elements of an array in ascending order
//find 2nd largest element 

import java.util.*;
class ArrayOperations
{
   //print the elements of an array
   public void printArray(int[] arr)
   {
      int n = arr.length;
	  System.out.println("Print array elements:");
	  for(int i=0;i<n;i++)
	  {
	     System.out.print(arr[i] + " ");
	  }
   }
   
   
   // find the frequency of each element
   public void frequencyOfElements(int[] arr)
   {
	   //find the frequency of each element
	   HashMap<Integer,Integer> map = new HashMap<>();
	   
	   for(int elem : arr)
	   {
		   map.put(elem,map.getOrDefault(elem,0)+1);
	   }
	    for(int elem : map.keySet())
		{
			System.out.println(elem + ":" + map.get(elem));
		}
   }
   
   
  
    //print the largest alement in an array
    public void largestElement(int[] arr)
	{
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		System.out.println("Largest Element in An Array is: " + largest);
	}
	
	
	//print the smllest element in an array
	public void smallestElement(int[] arr)
	{
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
		
		System.out.println("Smallest element in array : " + smallest);
	}
	
	//print the elements which is present on even positions
	
	  public void printEvenPosition(int[] arr)
	  {
		  
		  System.out.println("Elements presetn on even positon");
		  for(int i=0;i<arr.length;i+=2)
		  {
			  if(i%2==0)
			  {
				  System.out.print(arr[i] + " ");
			  }
		  }
		  
	  }
	  
	  
	  
  //print the elements which is present in oddd positions
	  public void printOddPosition(int[] arr)
	  {
		  for(int i=1;i<arr.length;i+=2)
		  {
			  System.out.print(arr[i] + " ");
		  }
	  }
	  
	  
	  //print elements in reverse order
	  public void printArrayReverse(int[] arr)
	  {
		
		  int start = 0;
		  int end = arr.length-1;
		  while(start<end)
		  {
			  int temp = arr[start];
			  arr[start] = arr[end];
			  arr[end] = temp;
			  
			start++;
		    end--;
			  
		  }
		
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(arr[i] + " ");
		  }
	  }
	  
	  //find duplicate elements of an array
	  
	  public void findDuplicates(int[] arr)
	  {
		  if(arr == null || arr.length ==0)
		  {
			  System.out.println("Array is empty or null");
			  return;
		  }
		  
		  HashSet<Integer> set = new HashSet<>();
		  boolean duplicateFound = false;
		  
		  for(int elem: arr)
		  {
			  if(!set.add(elem))
			  {
				  System.out.println(elem);
				  duplicateFound = true;
			  }
		  }
		  
		  if(!duplicateFound)
		  {
			  System.out.println("No Duplicate found");
		  }
	  }
		  
		  
		  //sort the elements of an array in ascending order
		  public void sortArray(int[] arr)
		  {
			  for(int i=0;i<arr.length-1;i++)
			  {
				  int minIndex = i;
				  for(int j=i+1;j<arr.length;j++)
				  {
					  if(arr[j]<minIndex)
					  {
						  minIndex = j;
					  }
				  }
				  
				  if(minIndex!=i)
				  {
					  int temp = arr[minIndex];
					  arr[minIndex] = arr[i];
					  arr[i] = temp;
				  }
			  }
			  
			  System.out.println("After Soritng: ");
			  for(int elem:arr)
			  {
				  System.out.print(elem + " ");
			  }
			  
			  
			  
		  }
		  
		  //find 2nd largest element 
		  public void  findSecondLargest(int[] arr)
		  { 
		  
		      int largest=Integer.MIN_VALUE;
			  int secondLargest = Integer.MIN_VALUE;
			  
			  for(int num:arr)
			  {
				  if(num>largest)
				  {
					  secondLargest = largest;
					  largest = num;
				  }
				  else
				  {
					  if(num>secondLargest && num!=largest)
					  {
						  secondLargest = num;
					  }
				  }
			  }
			   System.out.println("Largest:" + largest);
			   System.out.println("SecondLargest" + secondLargest);
			  
			  
		  }
		  
		  

	  }
	  
	  
	  
	  
	  
	  

   

