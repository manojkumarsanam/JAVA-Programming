import java.util.Random;
public class Main{
	public static void main( String[] args){
		Random randomNumbers = new Random();
		int count=0;
		int dice1,dice2; 
		for ( int roll = 1; roll <= 10000; roll++ )
		{ 
			dice1 = 1 + randomNumbers.nextInt( 6 ); 
			dice2 = 1 + randomNumbers.nextInt( 6 );
			if (dice1 == dice2*2 || dice1*2==dice2) {
				count += 1;}
		} 
		System.out.println("doubles are printed count = "+count);
		
	} 
}
