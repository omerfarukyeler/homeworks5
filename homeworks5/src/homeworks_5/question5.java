package homeworks_5;

import java.util.Scanner;

public class question5 {
	/*Kullanicidan baslangic ve bitis degerlerini alin.
	 *Baslangic degeri ve bitis degeri dahil aradalarindaki 
	 *tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
	 */
	
	    public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("baslangic degeri giriniz =");
		
		int baslangic =scan.nextInt();
		
		System.out.println("bitis degeri giriniz= ");
        
		int bitis =scan.nextInt();
		
		if (baslangic>bitis) {
			
			System.out.println("bitis sayisi daha buyuk olmalidir!!!");
		}
		
		while (baslangic<bitis) {
			
						
			if (baslangic%2==0) {
				
				System.out.println(baslangic);
			}
			
			baslangic++;
			
			
		}
		
	}

}
