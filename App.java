package pac;

import java.util.Scanner;

public class App {
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        while (true){
	            int x = (int) (Math.random() * 100);
	            int y = (int) (Math.random() * 100);
	            System.out.println("������һ�����֣�");
	            int i = scan.nextInt();
	            if (i==1){
	                System.out.println("x����"+x+" "+"y����"+y);
	            }
	        }
	    }
	}

