package list9x9;

/***
 * @author Bo-Xun Liao
 * 
 ***/

public class MultiTable {
	
	public MultiTable() {
		
		for(int i = 1; i <= 9; i ++)
		{
			for(int j = 1; j <= 9; j ++)
			{
				if(i * j / 10 < 1)
					System.out.print(i + " x " + j + " =  " + (i * j) + "   ");
				else
					System.out.print(i + " x " + j + " = " + (i * j) + "   ");
			}
			System.out.println();
		}
	}
		
}
