package homeworks_5;

import java.util.Scanner;

public class question7 {
	
	
	/*Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin. 
     *Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile)
   	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("bir sayi giriniz=");
		
		
		
	    int toplam =0;
		
	    int sayac =0;
		
	    int sayi =0;
	    do {
	    	
	    	sayi = scan.nextInt();
	    	
			if(sayi<0) {
				
				System.out.println("gecersizislem ,lutfen pozitif sayi giriniz !!!");
			}
			else 	{
				
				 toplam+=sayi;
				 sayac++;
			}
					
			
			}
			
			while(sayi!=0);
	        
	        System.out.println("girilen sayi "+(sayac)+"adettir");
	        
	        System.out.println("sayilar toplami:"+toplam);
			
			
		}
		
		
		
	}


