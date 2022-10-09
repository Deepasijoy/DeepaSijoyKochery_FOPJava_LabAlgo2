package org.greatlearning.iitr.lab.services.mergeSortImplementation;

import java.util.Scanner;

import org.greatlearning.iitr.lab.services.MergeSortImplementation;
import org.greatlearning.iitr.lab.services.NotesCount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MergeSortImplementation mergeSortImplementation=new MergeSortImplementation();
NotesCount notesCount=new  NotesCount();

System.out.println(" Enter the size of currency denomination");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int notes[]=new int[size];
System.out.println("Enter the currency denomination value");

for(int i=0;i<size;i++) {
	notes[i]=sc.nextInt();
}

System.out.println("Enter the amount you want to pay");
int amount=sc.nextInt();

mergeSortImplementation.sort(notes, 0, notes.length-1);
notesCount.notesCount(notes, amount);
	}

}
