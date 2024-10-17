class Main
{ 
  public static void main(String[] args)
  {
     //Example1 ex = new Example1();
	 //ex.display();
	 //Example2 ex2 = new Example2("hello world");
	 //ex2.print();
	 
	 int[] arr ={1,2,3,4,5,6};
	 int[] arr2 = {1,2,2,3,4,6};
	 int[] arr3 = {5,4,3,10,1};
	 ArrayOperations  marks = new ArrayOperations();
	// marks.printArray(arr);
	// marks.frequencyOfElements(arr2);
	//marks.largestElement(arr);
	//marks.smallestElement(arr);
	//marks.printEvenPosition(arr);
	//marks.printOddPosition(arr);
	//marks.printArrayReverse(arr);
	//marks.findDuplicates(arr2);
	//marks.sortArray(arr);
	marks.findSecondLargest(arr);
	
	
	
	 
  }
   
}