package org.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the size of array");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int ar[]=new int[size];
System.out.println("Enter array values");
for(int i=0;i<size;i++) 
	ar[i]=sc.nextInt();

	System.out.println("Enter the total no of targets that needs to be achieved");
	int targetNo=sc.nextInt();
	
	while(targetNo!=0) {
		int flag=0;
		long target;
		System.out.println("Enter the value of target");
		target=sc.nextLong();
		long sum=0;
		for(int i=0;i<size;i++) {
			sum+=ar[i];
			if(sum>=target) {
				System.out.println("Target achieved after"+" "+(i+1)+" "+"transactions");
				flag=1;
				break;
			}
	}if(flag==0)
		System.out.println("Target is not achieved");
	targetNo--;
}
	}

}
