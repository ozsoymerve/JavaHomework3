package com.trello.array;

public class otherFunction {
	public  int sumOfNumbers(int [] i){
		int sum=0;
		for (int j:i) {
			sum=sum+j;
		}
		return sum;
	}
	
	public void printList(int [] k){
		System.out.print("element of array:");
		for(int l=k.length-1;l>=0;l--){
			System.out.print(k[l]);
			if(l>0){
				System.out.print(",");
			}
		}		
	}
	
	public void addOneToValues(int [] m){
		System.out.print("\nadd one:");
		for(int i=0;i<m.length;i++){
		int value=m[i];
		value=value+1;
		if(i>0)
		System.out.print(value+",");
		}
	}
	
	public void addOneToListMember(int [] o){
		System.out.print("\nadd one for each element:");
		for(int i=0;i<o.length;i++){
			o[i]=o[i]+1;
			if(i>0)
			System.out.print(o[i]+",");
		};
	}
	

}
