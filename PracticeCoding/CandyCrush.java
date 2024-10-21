
import java.util.*;
class CandyCrush
{
public static void main(String[] args)
{
   String str = "xxyzzddd";
   int k = 3;
   System.out.println(removeDuplicates(str,k));
   
}

public static String removeDuplicates(String str,int k)
{
	Stack<Character> charSt = new Stack<>();
	Stack<Integer> countSt = new Stack<>();
	
	for(char ch : str.toCharArray())
{
	if(charSt.size()>0 && charSt.peek()==ch)
	{
		countSt.push(countSt.peek() + 1);
	}
	else
	{
		countSt.push(1);
	}
	charSt.push(ch);
	
	if(countSt.peek() == k)
	{
		for(int i=0;i<k;i++)
		{
			charSt.pop();
			countSt.pop();
		}
	}
}

StringBuilder sb = new StringBuilder();
while(charSt.size()>0)
{
	sb.append(charSt.pop());
	
}
return sb.reverse().toString();
}
}
