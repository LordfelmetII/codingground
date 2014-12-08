package main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> inputs = new ArrayList<String>();
		for(int i = 0; i<5; i++){
		inputs.add(sc.nextLine());
		}
		for(String i :inputs){
			analyse(i);
		}

	     sc.close();
	     
	}
	public static void analyse(String i){
		StringTokenizer st = new StringTokenizer(i, " ,"); 
	     String start = st.nextToken(); 
	     String end = st.nextToken();
	     double milesPerGallon = analyseCar(st.nextToken()); 
	     double milesPerHour = analyseRoad(st.nextToken()); 
	     double fuelCost = Double.parseDouble(st.nextToken());
	     new Navigator(start, end, milesPerGallon, milesPerHour, fuelCost);
	}
	
	private static double analyseCar(String s){
		switch(s){
		case("C"):
			return 28;
		case("M"):
			return 25;
		case("F"):
			return 22;
		case("V"):
			return 20;
		default:
			System.out.println("error- bad input- car type");
			return 0;
		}
	}
	private static double analyseRoad(String s){
		switch(s){
		case("I"):
			return 65;
		case("H"):
			return 60;
		case("M"):
			return 55;
		case("S"):
			return 45;
		default:
			System.out.println("error- bad input- road type");
			return 0;
		}
	}
}
