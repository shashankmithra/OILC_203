
public class Dowhile {
/**
 *   WAP 1-10 NUMBERS BY USING DO-WHILE ?
 *   AND SUM OF THEM? 
 * @param args
 */
	
	public static void main(String[] args) {
		int i=1,sum=0;
		do {
			System.out.println(i);
			sum=sum+i;
			i++;
			
		}while(i<=10);
		System.out.println("SUM ="+sum);

	}

}
