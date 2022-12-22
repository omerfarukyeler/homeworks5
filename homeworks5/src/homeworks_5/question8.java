package homeworks_5;

import java.util.Scanner;

public class question8 {
	
	
	/*Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e ulasincaya kadar sayi istemeye devam edin. 
	 *Toplam 500’e ulastiginda veya gectiginde sayilarin toplami ve kac sayi girildigini
	 *yazdirin.(do while dongusu ile)
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("toplanacak sayilari giriniz=");

		int sayi =0;
		
		int sayac =0;
		
		int toplam =0;
		
		do {
			
		sayi=scan.nextInt() ;	
		
		toplam+=sayi;
		 	
		sayac++;
		 		
					
		}
		
		while(toplam<=500 ); {
		
		
			System.out.println("girilen sayilarin toplami "+ toplam);
			System.out.println(sayac+ " tane sayi girdiniz ");
			
		}
		
		
		
	}

}
