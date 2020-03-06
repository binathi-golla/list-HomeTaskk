package com.bind.list_hometask;

public class List {
	public static void main(String[] args)
    {
        implementation<Integer> list = new implementation<Integer>();
        int val;
        list.addele(34);
        list.addele(32);
        list.addele(30);
        list.addele(15);
        System.out.println("size of the list");
        System.out.println(list.size());
        System.out.println(list);
        val=list.removeele(1);
        System.out.println("element removed:"+val);
        System.out.println("size of the list after removing element from position 1");
        System.out.println(list.size());
        System.out.println(list);
        list.addele(28);
        System.out.println(list);
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
        System.out.println( list.get(2) );
        
    }
}
