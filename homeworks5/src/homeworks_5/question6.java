package homeworks_5;

import java.util.Scanner;

public class question6 {
	/*Kullanicidan bir sayi alin ve bu sayiyi 
	 * tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin.(while dongusu ile)
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lutfen bir sayi giriniz=");
		
		int sayi = scan.nextInt();
		
		int bolen=1;
		
		int sayac = 0;
	
		while (sayi>bolen) {
			
			if(sayi%bolen==0) {
			
			sayac++;
			
			System.out.println(sayac+ " tane bolen var ");
			
				
			System.out.println(sayi+" sayisi "+bolen+" sayisina tam bolunur.");
			}
			
			bolen++;
		
			
		}
		
							
		
		
			
			
		
		
		
		
		}
						
			
											
	}
	



