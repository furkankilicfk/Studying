package com.java;

import java.util.Scanner;

public class Studying {
	 
	public static void main(String[] args){
System.out.println("HESAP MAKINESI");
 Scanner girilen = new Scanner(System.in);

System.out.println("İşlem Menüsü\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");

	  int islem;
	  while(true){

	System.out.println("Lütfen İşlem Seçiniz (1-4 arasında sayı giriniz) :");
	islem = girilen.nextInt();

	if(islem > 0 && islem < 5) {
	System.out.println("Hesaplamanızı Yapınız");
	break;

	            }
	        }

	 System.out.println("1.Sayı:");
	 int s1 = girilen.nextInt();

	 System.out.println("2.Sayı:");
	 int s2 = girilen.nextInt();

	 if(islem == 1){

	   System.out.println(s1 + " + " + s2 + " = " + (s1+s2));

	   }
	    else if(islem == 2){

	   System.out.println(s1 + " - " + s2 + " = " + (s1-s2));

	   }
	   else if(islem == 3){

	   System.out.println(s1 + " * " + s2 + " = " + (s1*s2));

	   }
	   else if(islem == 4){

	   System.out.println(s1 + " / " + s2 + " = " + ((float)s1/(float)s2));

	   }
}
}

