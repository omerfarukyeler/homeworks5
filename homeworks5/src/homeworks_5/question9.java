package homeworks_5;

import java.util.Scanner;

public class question9 {
	/*
	 * Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun. Ornek,kullanici 3 girerse,
     *  1 2 3    
     *  2 4 6
     *  3 6 9 
     * (ic ice for ile) [Zor seviye – Yapamazsaniz onemli deil.]
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lutfen pozitif bir rakam giriniz !!!sana carpim tablosu olusturayim");

		int sayi =scan.nextInt();
		
		if ((!(sayi>9)) && !(sayi<=0)) {
		
			
			for (int birincisayi=1;birincisayi<=sayi;birincisayi++) {
				
				for(int ikincisayi=1;ikincisayi<=sayi;ikincisayi++) {
					
					System.out.print(birincisayi*ikincisayi+" ");
				}
				System.out.println();
			}
				
			}
		else {
		System.out.println("9dan buyuk ve 0 dan kucuk bir sayiyi yapamam");
		}
	}

}
