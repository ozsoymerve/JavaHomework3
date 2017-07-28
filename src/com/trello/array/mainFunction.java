package com.trello.array;

public class mainFunction {

	public static void main(String[] args) {
		int numbers[]={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int a;	
		otherFunction of=new otherFunction();
	int	sumOfElements=of.sumOfNumbers(numbers);
		System.out.println("sum:"+sumOfElements);
		
		of.printList(numbers);
		
		of.addOneToValues(numbers);
		System.out.print("\ncall printList again:");
		of.printList(numbers);
		
		
		of.addOneToListMember(numbers);
		System.out.print("\ncall printList again:");
		of.printList(numbers);
	}
	
	
	


}
