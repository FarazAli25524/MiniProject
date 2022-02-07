import java.util.*;
class MiniProject{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.print("1. Calculator\n2. Unit Convertor\n3. Season\n4. Alphabetic Letter\n5. Age Comparing\n6. Marksheet\n7. Hesco Bill Calculator\n8. Trolly Load\n9. ATM\n10. Employee Salary\n11. Exit\nChoose Option:");
		int opt = obj.nextInt();
		
		if(opt == 1){
			System.out.print("\n1. Calculator(Menu)\n2. Calculator(operator)\nChoose Option:");
			opt = obj.nextInt();
			
			if(opt == 1){
				System.out.print("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder\nChoose Option:");
				opt = obj.nextInt();
				
				if(opt == 1){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
	
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
					
					System.out.println("Addition is:" + (firstnum + secondnum));
				}
				
				else if(opt == 2){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
	
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
					
					System.out.println("Subtraction is:" + (firstnum - secondnum));
				}
				
				else if(opt == 3){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
	
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
					
					System.out.println("Multiplication is:" + (firstnum * secondnum));
				}
				
				else if(opt == 4){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
	
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
					
					System.out.println("Division is:" + (firstnum / secondnum));
				}
				
				else if(opt == 5){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
	
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
					
					System.out.println("Remainder is:" + (firstnum % secondnum));
				}
				
				else{
					System.out.println("Invalid Operator");
				}
			}
			
			else if(opt == 2){
				System.out.print("Enter operator:");
				char op = obj.next().charAt(0);
			
				if(op == '+'){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
				
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
				
					System.out.println("Addition is:" + (firstnum + secondnum));
				}
			
				else if(op == '-'){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
				
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
				
					System.out.println("Subtraction is:" + (firstnum - secondnum));
				}
			
				else if(op == '*'){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
				
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
				
					System.out.println("Multiplication is:" + (firstnum * secondnum));
				}
			
				else if(op == '/' || op == '\\'){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
				
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
				
					System.out.println("Division is:" + (firstnum / secondnum));
				}
			
				else if(op == '%'){
					System.out.print("Enter first number:");
					int firstnum = obj.nextInt();
				
					System.out.print("Enter second number:");
					int secondnum = obj.nextInt();
				
					System.out.println("Remainder is:" + (firstnum % secondnum));
				}
			
				else{
					System.out.println("Invalid Operator");
				}
			}
			
			else{
				System.out.println("Invalid option");
			}
		}
		
		else if(opt == 2){
			System.out.print("\n1. Inch To Feet\n2. Feet To Inch\n3. Kilo To Gram\n4. Gram To Kilo\nChoose Option:");
			opt = obj.nextInt();
			
			if(opt == 1){
				System.out.print("Enter inch:");
				int inch = obj.nextInt();
				int feet = inch / 12;
				System.out.println("Feet :" + feet);
			}
			
			else if(opt == 2){
				System.out.print("Enter feet:");
				int feet = obj.nextInt();
				int inch = feet * 12;
				System.out.println("Inches :" + inch);
			}
			
			else if(opt == 3){
				System.out.print("Enter Kilo:");
				int kilo = obj.nextInt();
				int gram = kilo * 1000;
				System.out.println("Gram :" + gram);
			}
			else if(opt == 4){
				System.out.print("Enter  Gram:");
				int gram = obj.nextInt();
				int kilo = gram / 1000;
				System.out.println("Kilo :" + kilo);
			}
			else{
				System.out.println("Invalid option");
			}
		}
		else if(opt == 3){
			System.out.print("\nEnter Month Number:");
			int month = obj.nextInt();
			
			if(month == 1 || month == 11 || month == 12){
				System.out.println("Season is Winter");
			}
			else if(month == 2 || month == 3 || month == 4){
				System.out.println("Season is Spring");
			}
			else if(month == 5 || month == 6 || month == 7){
				System.out.println("Season is Summer");
			}
			else if(month == 8 || month == 9 || month == 10){
				System.out.println("Season is Autumn");
			}
			else{
				System.out.println("Invalid Month");
			}
		}
		else if(opt == 4){
			System.out.print("Enter Alphabetic Letter:");
			char letter = obj.next().charAt(0);
		
			if(letter == 'A' || letter == 'a'){
				System.out.println(letter + " for " + letter + "pple");
			}
			else if(letter == 'B' || letter == 'b'){
				System.out.println(letter + " for " + letter  + "all");
			}
			else if(letter == 'C' || letter == 'c'){
				System.out.println(letter + " for " + letter + "at");
			}
			else if(letter == 'D' || letter == 'd'){
				System.out.println(letter + " for " + letter + "og");
			}
			else if(letter == 'E' || letter == 'e'){
				System.out.println(letter + " for " + letter + "lephant");
			}
			else if(letter == 'F' || letter == 'f'){
				System.out.println(letter + " for " + letter + "lower");
			}
			else if(letter == 'G' || letter == 'g'){
				System.out.println(letter + " for " + letter + "lass");
			}
			else if(letter == 'H' || letter =='h'){
				System.out.println(letter + " for " + letter + "orse");
			}
			else if(letter == 'I' || letter == 'i'){
				System.out.println(letter + " for " + letter + "ce");
			}
			else if(letter == 'J' || letter == 'j'){
				System.out.println(letter + " for " + letter + "ungle");
			}
			else if(letter == 'K' || letter =='k'){
				System.out.println(letter + " for " + letter + "ite");
			}
			else if(letter == 'L' || letter =='l'){
				System.out.println(letter + " for " + letter + "emon");
			}
			else if(letter == 'M' || letter == 'm'){
				System.out.println(letter + " for " + letter + "ango");
			}
			else if(letter == 'N' || letter == 'n'){
				System.out.println(letter + " for " + letter + "ewyork");
			}
			else if(letter =='O' || letter == 'o'){
				System.out.println(letter + " for " + letter + "range");
			}
			else if(letter == 'P' || letter == 'p'){
				System.out.println(letter + " for " + letter + "urplr");
			}
			else if(letter == 'Q' || letter == 'q'){
				System.out.println(letter + " for " + letter + "ueen");
			}
			else if(letter == 'R' || letter == 'r'){
				System.out.println(letter + " for " + letter + "oof");
			}
			else if(letter == 'S' || letter == 's'){
				System.out.println(letter + " for " + letter + "unflower");
			}
			else if(letter == 'T' || letter =='t'){
				System.out.println(letter + " for " + letter + "urplr" );
			}
			else if(letter == 'U' || letter == 'u'){
				System.out.println(letter + " for " + letter + "mbrella");
			}
			else if(letter == 'V' || letter == 'v'){
				System.out.println(letter + " for " + letter + "anilla");
			}
			else if(letter == 'W' || letter == 'w'){
				System.out.println(letter + " for " + letter + "ater");
			}
			else if(letter == 'X' || letter == 'x'){
				System.out.println(letter + " for " + letter + "-rays");
			}
			else if(letter == 'Y' || letter == 'y'){
				System.out.println(letter + " for " + letter + "ellow");
			}
			else if(letter == 'Z' || letter == 'z'){
				System.out.println(letter + " for " + letter + "ebra");
			}
			else{
				System.out.println("Invalid Letter");
			}
		}
		else if(opt == 5){
			System.out.print("\n1. Two Age Comparision\n2. Three Age Comparision\n3. Five Age Comparision\nChoose Option:");
			opt = obj.nextInt();
			
			if(opt == 1){
				System.out.print("Enter First Age:");
				int firstage = obj.nextInt();
				System.out.print("Enter Second Age:");
				int secondage = obj.nextInt();
				
				if(firstage > secondage){
					System.out.println("First Age is Greater");
				}
				else if(secondage > firstage){
					System.out.println("Second Age is Greater");
				}
				else{
					System.out.println("Both Ages are Equal");
				}
			}
			else if(opt == 2){
				System.out.print("Enter First Age:");
				int firstage = obj.nextInt();
				
				System.out.print("Enter Second Age:");
				int secondage = obj.nextInt();
				
				System.out.print("Enter Third Age:");
				int thirdage = obj.nextInt();
				
				if(firstage > secondage){
					if(firstage > thirdage){
						System.out.println("First Age is Greater");
					}
				}
				else if(secondage > firstage){
					if(secondage > thirdage){
						System.out.println("Second Age is Greater");
					}
				}
				else if(thirdage > firstage){
					if(thirdage > secondage){
						System.out.println("Third Age is Greater");	
					}
				}
				else{
					System.out.println("Invalid Age");
				}
			}
			else if(opt == 3){
				System.out.print("Enter First Age:");
				int firstage = obj.nextInt();
				System.out.print("Enter Second Age:");
				int secondage = obj.nextInt();
				System.out.print("Enter Third Age:");
				int thirdage = obj.nextInt();
				System.out.print("Enter Fourth Age:");
				int fourthage = obj.nextInt();
				System.out.print("Enter Fifth Age:");
				int fifthage = obj.nextInt();
				
				if(firstage > secondage){
					if(firstage > thirdage){
						if(firstage > fourthage){
							if(firstage > fifthage){
								System.out.println("First Age is Greater");
							}
						}
					}
				}
				else if(secondage > firstage){
					if(secondage > thirdage){
						if(secondage > fourthage){
							if(secondage > fifthage){
								System.out.println("Second Age is Greater");
							}
						}
					}
				}
				else if(thirdage > firstage){
					if(thirdage > secondage){
						if(thirdage > fourthage){
							if(thirdage > fifthage){
								System.out.println("Third Age is Greater");
							}
						}
					}
				}
				else if(fourthage > firstage){
					if(fourthage > secondage){
						if(fourthage > thirdage){
							if(fourthage > fifthage){
								System.out.println("Fourth Age is Greater");
							}
						}
					}
				}
				else if(fifthage > firstage){
					if(fifthage > secondage){
						if(fifthage > thirdage){
							if(fifthage > fourthage){
								System.out.println("Fifth Age is Greater");
							}
						}
					}
				}
				else{
					System.out.println("Invalid Age");
				}
			}
		}
		else if(opt == 6){
			System.out.print("Enter percentage:");
			int perc = obj.nextInt();
			
			if(perc >= 90 && perc <= 100){
				System.out.println("Grade: A1");
			}
			else if(perc >=80 && perc < 90){
				System.out.println("Grade: A");
			}
			else if(perc >= 70 && perc < 80){
				System.out.println("Grade: B");
			}
			else if(perc >= 60 && perc < 70){
				System.out.println("Grade: C");
			}
			else if(perc >= 50 && perc < 60){
				System.out.println("Grade: D");
			}
			else if(perc >= 39 && perc < 50){
				System.out.println("Grade: E");
			}
			else if(perc < 39){
				System.out.println("Grade: F");
			}
			else{
				System.out.println("Percentage Overflow");
			}
		}
		else if(opt == 7){
			System.out.print("Enter Units:");
			int units = obj.nextInt();
			
			if(units <= 100){
				System.out.println("\nBill Units "+ units +"*2:" + (units*2));
				System.out.println("Charges will be:" + (units*2));
			}
	
			else if(units>100 && units<=200){
				int rem_units = units - 100;
				int bill_charges = (100*2) + (rem_units*4);
				System.out.println("100*2 :" + (100*2));
				System.out.println(rem_units +"*4 :" + (rem_units*4));
				System.out.println("Charges will be:" + bill_charges);
			}
	
			else if(units>200 && units<=300){
				int rem_units = units - 200;
				int bill_charges = (100*2) + (100*4) + (rem_units*6);
				System.out.println("100*2 :"+ (100*2));
				System.out.println("100*4 :"+ (100*4));
				System.out.println(rem_units +"*6 :"+ (rem_units*6));
				System.out.println("Charges will be:" + bill_charges);
			} 
	
			else if(units>300 && units<=400){
				int rem_units = units - 300;
				int bill_charges = (100*2) + (100*4) + (100*6) + (rem_units*8);
				System.out.println("100*2 :"+ (100*2));
				System.out.println("100*4 :"+ (100*4));
				System.out.println("100*6 :"+ (100*6));
				System.out.println(rem_units +"*8 :"+ (rem_units*8));
				System.out.println("Charges will be:" + bill_charges);		
			}
	
			else if(units>400){
				int rem_units = units - 400;
				int bill_charges = (100*2) + (100*4) + (100*6) + (100*8) + (rem_units*10);
				System.out.println("100*2 :"+ (100*2));
				System.out.println("100*4 :"+ (100*4));
				System.out.println("100*6 :"+ (100*6));
				System.out.println("100*8 :"+ (100*8));
				System.out.println(rem_units +"*10 :"+ (rem_units*10));
				System.out.println("Charges will be:" + bill_charges);
			}
			else{
				System.out.println("Invalid Units");
			}
		}
		else if(opt == 8){
			System.out.print("Enter Load:");
			int Load = obj.nextInt();
	
			int Total_Income = 1200 * Load;
			int Driver = 150 * Load;
			int Tax_10 = ((Total_Income/100)*10) * Load;
			int Diesel = 210 * Load;
			int Net_Income = 720 * Load;
	
			System.out.println("Total Income:" + (Total_Income));
			System.out.println("Driver:" + (Driver));
			System.out.println("Tax 10%:" + (Tax_10));
			System.out.println("Diesel:" + (Diesel));
			System.out.println("Net Income:" + (Net_Income));
		}
		else if(opt == 9){
			System.out.print("Enter Rupees:");
			int amount = obj.nextInt();

			int _5000 = amount / 5000;
			int Rem_5000 = amount % 5000;
	
			int _1000 = Rem_5000 / 1000;
			int Rem_1000 = Rem_5000 % 1000;
	
			int _500 = Rem_1000 / 500;
			int Rem_500 = Rem_1000 % 500;
	
			int _100 = Rem_500 / 100;
			int Rem_100 = Rem_500 % 100;
	
			int _50 = Rem_100 / 50;
			int Rem_50 = Rem_100 % 50;
	
			int _20 = Rem_50 / 20;
			int Rem_20 = Rem_50 % 20;
	
			int _10 = Rem_20 / 10;
			int Rem_10 = Rem_20 % 10;
	
			int _5 = Rem_10 / 5;
			int Rem_5 = Rem_10 % 5;
	
			int _2 = Rem_5 / 2;
			int Rem_2 = Rem_5 % 2;
	
			int _1 = Rem_2 / 1;
			int Rem_1 = Rem_2 % 1;
	
			System.out.println("5000:" + _5000);
			System.out.println("1000:" + _1000);
			System.out.println("500:" + _500);
			System.out.println("100:" + _100);
			System.out.println("50:" + _50);
			System.out.println("20:" + _20);
			System.out.println("10:" + _10);
			System.out.println("5:" + _5);
			System.out.println("2:" + _2);
			System.out.println("1:" + _1);
		}
		else if(opt == 10){
			System.out.print("Enter Basic Pay:");
			int basicPay = obj.nextInt();
				
			int houseRent45 = (basicPay / 100) * 45;
			int medicalAllownace15 = (basicPay / 100) * 15;
			int bonus5 = (basicPay / 100) * 5;
			
			int grossPay = basicPay + houseRent45 + medicalAllownace15 + bonus5;
				
			int incometax5 = (basicPay / 100) * 5;
			int convanceAllowance8 = (basicPay / 100) * 8;
			float zakaat2_5 = (basicPay / 100) * 2.5f;
			
			float tax = incometax5 + convanceAllowance8 + zakaat2_5;
			
			float netIncome = grossPay - tax;
				
			System.out.println("House Rent 45%:" + houseRent45);
			System.out.println("Medical Allowance 15%:" + medicalAllownace15);
			System.out.println("Bonus 5%:" + bonus5);
			System.out.println("\nGross Pay:" + grossPay);
			System.out.println("\n Income Tax 5%:" + incometax5);
			System.out.println("Convance Allowance 8%:" + convanceAllowance8);
			System.out.println("Zakaat 2.5%:" + zakaat2_5);
			System.out.println("\nNet Income:" + netIncome);
		}
		else if(opt == 11){
			System.exit(0);
		}
	}
}