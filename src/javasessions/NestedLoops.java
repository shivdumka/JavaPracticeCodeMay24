package javasessions;

public class NestedLoops {

	public static void main(String[] args) 
	{
		
//		00 01 02 03 04 05
//		10 11 12 13 14 15
//		20 21 22 23 24 25
//		30 31 32 33 34 35
//		40 41 42 43 44 45 
//		50 51 52 53 54 55
		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print(i+""+j+" ");
				break;
//				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------");
		//Print the pattern:		
//		000 001 002 003 004 005
//		110 111 112 113 114 115
//		220 221 222 223 224 225
//		330 331 332 333 334 335
//		440 441 442 443 444 445 
//		50  51 52 53 54 55
		for (int i = 0; i <= 5; i++) //0
		
//			for (int j = 0; j <= 5; j++) //0
			{
				for(int k=0;k<=5;k++) //0 1 2 3 4 5 
				{
					System.out.print(i+""+i+""+k+" ");
				}
			
			System.out.println();
			}
		System.out.println("------------------------------------------------------------------------------");
		 for (int t = 1; t <= 5; t++) {
	            for (int s = 1; s <= 5; s++) {
	                for (int f = 1; f <= 5; f++) {
	                    System.out.println(t + "" + s + f);
	                }
	            }
		

	}

}
	}
