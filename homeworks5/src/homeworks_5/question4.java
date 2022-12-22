package homeworks_5;

import java.util.Scanner;

public class question4 {
	
	/*Kullanıcıdan aldıgınız 5 basamaklı sayının rakamlarının 
	 * toplamını yazdıran programi for döngüsü ile yazınız
	 */

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lutfen 5 basamakli bir sayi giriniz =");
		
		
		int sayi =scan.nextInt();
		
		int toplam=0 ;
		
		for(int i=1 ;i<=5 ; i++) {
			
			toplam+=sayi % 10;
			
			sayi=sayi/10;
			
			
			
			
			
			
		}
		
		
		System.out.println(toplam);
		
		}
			
		}
		

	


