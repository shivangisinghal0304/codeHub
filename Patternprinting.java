public class Pattern5 {

	public static void main(String[] args) {
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<7;j++) {
				if(((Math.abs(i-j)==1)||(Math.abs(i-j)==3)) && ((i+j)!=1)) {
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		// TODO Auto-generated method stub

	}

}
