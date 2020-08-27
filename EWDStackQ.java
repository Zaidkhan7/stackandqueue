import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;
public class EWDStackQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Stack<Integer> s = new Stack<Integer>();
			Queue<Integer> q = new LinkedList<>();
			Scanner obj = new Scanner(System.in);
			int n;
			s.add(1);
			s.add(2);
			s.add(3);
			s.add(4);
			s.add(5);
			s.add(6);
			s.add(7);
			s.add(8);
			System.out.println("Cars in the Stack : "+s);
			
			System.out.println("Enter car to be moved");
			n= obj.nextInt();
			
			if(n>0&&n<8)
			{
				do
				{
					q.add(s.pop());
					
				}while(n!=s.peek());
				System.out.println("cars in the street :"+q);
				System.out.println("cars in the parking lot : "+s);
				s.pop();
				while(!q.isEmpty())
				{
					s.add(q.remove());
				}
				System.out.println("cars left in the parking lot"+s);
			}
			else if(n==8)
				System.out.println("There is no car behind you buddy..take it home");
			else
				System.out.println("No such car exists in the parking lot");
			
			obj.close();
			
	
	
	}

}
