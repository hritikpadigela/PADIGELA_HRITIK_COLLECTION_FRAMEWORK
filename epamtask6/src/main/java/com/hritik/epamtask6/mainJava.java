package com.hritik.epamtask6;

public class mainJava {

	public static void main(String[] args) {
		NewCustomList<Integer> custList = new NewCustomList<Integer>();
		custList.add(1);
		custList.add(2);
		custList.add(3);
		custList.add(4);
		custList.add(5);
        System.out.println("The list is : " + custList);
        custList.add(6);
        System.out.println("After add operation : " + custList);
        custList.remove(3);
        System.out.println("After remove operation " + custList);
        System.out.println("Performing get operation "  +  custList.get(1));
        System.out.println("Finding size of list "  +  custList.size());
        custList.clear();
        System.out.println("After clear operation " + custList);
	}

}
