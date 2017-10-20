import java.util.Scanner;
public class dice {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("How many times do you want to roll the dice?");
		int roll = in.nextInt();// number of rolls
		int count =0; //number of times rolled
		int c=0;
		
		int x;//dice one
		int y;//dice two
		int z = 0;//sum
		
		int two =0;
		int thr =0;
		int fou =0;
		int fiv =0;
		int six =0;
		int sev =0;
		int eig =0;
		int nin =0;
		int ten =0;
		int ele =0;
		int twe =0;

		for(count=0;count<roll;count++){
			x= (int)((Math.random()*6)+1);
			y= (int)((Math.random()*6)+1);
			z= x+y;
			System.out.print(z+" ");
		
			if (z==2)two++;
			if (z==3)thr++;
			if (z==4)fou++;
			if (z==5)fiv++;
			if (z==6)six++;
			if (z==7)sev++;
			if (z==8)eig++;
			if (z==9)nin++;
			if (z==10)ten++;
			if (z==11)ele++;
			if (z==12)twe++;
		
	}
		System.out.println("");
		
		System.out.print("2:");
		while (c<two){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("3:");
		while (c<thr){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("4:");
		while (c<fou){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("5:");
		while (c<fiv){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("6:");
		while (c<six){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("7:");
		while (c<sev){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("8:");
		while (c<eig){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("9:");
		while (c<nin){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("10:");
		while (c<ten){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("11:");
		while (c<ele){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		System.out.print("12:");
		while (c<twe){
			System.out.print("* ");
			c++;
		}
		System.out.println("");
		c=0;
		
		}

	}

