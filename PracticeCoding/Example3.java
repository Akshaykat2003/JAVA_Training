class Example3
{
    
	
	private void display()
    {
	  System.out.println("hello world");
	}
     public void getDisplay()
   {
        display();
   }	 
   
   
	public static void main(String[] args)
	{
	  Example3 ex3 = new Example3();
	  ex3.getDisplay();
	}
 	
	
	
}