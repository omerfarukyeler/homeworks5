package homeworks_5;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		
		
		/*”InfotechAcademy1234…!’^.+” String ifadesinde,
         *   a.	kac harf
         *    b.	kac rakam
         *    c.	kac ozel karakter oldugunu ekrana yazdıran 
         *   karakterSay() metodunu yazınız.
         * 
		 */ 
		  		
		String kontrol = "InfotechAcademy1234…!’^.+" ;
		
		karakterSay(kontrol);
		
			
	}
	
	public static void karakterSay(String kontrolfarklı) {
		
		
		int sayac1 = 0 ;
		
		int sayac2 = 0 ;
		
		int sayac3 = 0 ;
		
		for ( int i =0 ;i< kontrolfarklı.length(); i++ ) { 
			
			if((kontrolfarklı.charAt(i)>=65 && kontrolfarklı.charAt(i)<=90) ||
			(kontrolfarklı.charAt(i)>=97  && kontrolfarklı.charAt(i)<=122)){
				
				
				sayac1++;
				
			}
		    else if ((kontrolfarklı.charAt(i)>=48 && kontrolfarklı.charAt(i)<=57) ){
						
						
						sayac2++;
			
			
			
			}
			
			
		    else { sayac3++;
		    	
		    	
						
						
					}
		    	
		    }
		
		System.out.println("bu yazida "+sayac1 +" tane harf vardir");
		System.out.println("bu yazida "+sayac2 +" tane rakam vardir");
		System.out.println("bu yazida "+sayac3 +" tane karakter vardir");
			
		}
		
		
		
	}

