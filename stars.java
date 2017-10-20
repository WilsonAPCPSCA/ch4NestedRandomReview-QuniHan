import java.util.Scanner;
public class stars {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter the length: ");
		int sl = in.nextInt(); //l for side length
		
		int count=100;
	
		String space ="                                                                                   ";
		//literally a string of spaces
		
		int z = 1;//number of * in a line
		int v= ((sl*2)+1);//number of lines 
		int i = sl;//i is related to substring
	
		for(int x=1;x<=v;x++){
			//x represents length
			System.out.print(space.substring(0,i));
			
			for (int y=1;y<=z;y++){
				System.out.print( "* " );		
				
			}
		
			if(z<=sl&&count>0){
				z++;
			}
			else count=-100;
			if(z>(-1*sl)&&count<0)z--;
		
		if(count>0)i--;
		else i++;
		System.out.println("");	
		}
		
		}
		
	}


