package StackProblmes;

import java.util.Scanner;

public class WaterStorecapacity {

	public static void main(String args[]){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");

		int size = sc.nextInt();

		System.out.println("Enter the heights");
		int input[] = new int[size];

		for(int i = 0; i < size; i++){
			input[i] = sc.nextInt();
		}
		System.out.println("Thanks Caliculating");

		System.out.println(getStoredwWater(input));
	}

	private static int getStoredwWater(int[] input) {
		
		Stack s  = new Stack();
		int max = 0;
		int mc = 0;
		int ac = 0;
		int count = 0;
		int top;
		int ele;
		for(int i= 0; i < input.length; i++){
			ele = input[i];
			if(i == 0 && ele != 0){
				s.push(ele);
				continue;
			} else if( i==0){
				continue;
			}
			if(ele <= s.top() || s.top() == -100 ){
				s.push(ele);
			} else {
				while(!s.isEmpty()){
					top = s.pop();
					if(top < max){
						if(ele<max)
						count += max - ele;
						else {
							ac += count;
							count = 0;
						}
						mc = ele - top;
					ac+= mc > max? max:mc;
					}  else{
					s.push(ele);
					break;
					}
				}
			}
			max = ele > max ? ele : max;
		}
		return ac;
	}
	
	
}
