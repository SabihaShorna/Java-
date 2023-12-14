package sj;
import java.util.Scanner;
public class Sa {


			public static boolean isvalid(double side1, double side2, double side3) {
				if(((side1 + side2) > side3) && ((side2 + side3) > side1) && ((side1 + side3) > side2)) {
					return true;
				}
				return false;
			}
			
			public static double area(double side1, double side2, double side3) {
				double a = side1;
				double b = side2;
				double c = side3;
				double s = (a + b + c) / 2;
				double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
				return area;
			}
			
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				double side1;
				double side2;
				double side3;
				
				System.out.print("Enter Side1:");
				side1 = scan.nextDouble();
				System.out.print("Enter Side2:");
				side2 = scan.nextDouble();
				System.out.print("Enter Side3:");
				side3 = scan.nextDouble();
				
				if(isvalid(side1, side2, side3)) {
					double triangleArea = area(side1, side2, side3);
					System.out.printf("Area: %.2f\n", triangleArea);
				}
				else {
					System.out.println("Invalid Triangle");
				}
			}


		}


