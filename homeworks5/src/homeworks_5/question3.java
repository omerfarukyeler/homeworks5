package homeworks_5;

import java.util.Scanner;

public class question3 {
	
	/*Kullanicidan uslu sayi hesabi 
	 *icin iki adet integer sayi isteyin.
	 *integer donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun. 
	 *Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin. 
	 *Islemin sonucunu main method’ dan verilen komutla yazdirin.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lutfen 1.sayiyi  giriniz =");
		
		int tabansayi =scan.nextInt();
		
		System.out.println("lutfen 2.sayiyi  giriniz =");
		
		int ustsayi = scan.nextInt();		
		
		int carpim = usalma(tabansayi,ustsayi);
		
		System.out.println(tabansayi +"^"+ ustsayi+"="+ carpim );
	}

		

		public static int usalma (int tabansayi1 ,int ustsayi1) {
			
		return (int) Math.pow(tabansayi1, ustsayi1) ;
		
	
		
		
		
			
		
			
		}
			
		
		}

