package edu.handong.csee.java.lab06;

//import static org.junit.Assert.fail;

import java.util.Scanner;

public class Roach_population {
	
	final double GROWTH_RATE=0.95;
	final double ONE_BUG_VOLUME=0.002;
	float houseVolume;
	int startPopulation;
	int countWeeks=0;
	double population;
	double totalBugVolume;
	double newBugs;
	double newBugVolume;
	
	public static void get_volume(Roach_population r) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the volume of your house");
		System.out.printf("in cubic feet: ");
		r.houseVolume=keyboard.nextFloat();
	}
	
	public static void get_roach(Roach_population r) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter the estimated number of");
		System.out.printf("roaches in your house: ");
		r.startPopulation=keyboard.nextInt();
	}
	
	public static void compute(Roach_population r) {
		r.population=r.startPopulation;
		r.totalBugVolume=r.population*r.ONE_BUG_VOLUME;
		
		while (r.totalBugVolume<r.houseVolume) {
			r.newBugs=r.population*r.GROWTH_RATE;
			r.newBugVolume=r.newBugs*r.ONE_BUG_VOLUME;
			r.population+=r.newBugs;
			r.totalBugVolume=r.totalBugVolume+r.newBugVolume;
			r.countWeeks=r.countWeeks+1;
		}
	}
	
	public static void display(Roach_population r) {
		System.out.println("Starting with a roach population of "+r.startPopulation);
		System.out.println("and a house with a volume of "+r.houseVolume+" cubic feet,");
		System.out.println("after "+r.countWeeks+" weeks,");
		System.out.println("the house will be filled with "+(int)r.population+" roaches.");
		System.out.println("They will fill a volume of "+(int)r.totalBugVolume+" cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roach_population r1 = new Roach_population();
		
		get_volume(r1);
		get_roach(r1);
		compute(r1);
		display(r1);
	}
	
}
