package homeworks_5;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		/*Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara gore e mail kontrolu yapiniz.
         * -@ isareti icermiyorsa “gecersiz email” yazdirin
         *-@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin
         *-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz” yazdirin.
		 */
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen e mail adresinizi giriniz = ");
		
		String mailadres1 =scan.nextLine();
		
		
		System.out.println(method2(mailadres1));
		
		
		

	}
	public static String method2 (String mailadres ){
		
		
		
		if( (mailadres.contains("@")== false )) {
			
			System.out.println("gecersiz email");
			
			
		}
		
		else if (mailadres.contains("@gmail")==false) {
			
			System.out.println("lutfen gmail adresinizi girin");
			
				
			
			
		}
		
		
		
		else if (mailadres.endsWith("@gmail.com")==false ){
			
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		
		}	
		
		else {
			
			System.out.println("e mail hesabiniz olusturuldu.");
		}
			
					
		return mailadres ;
	
		
	}
}
