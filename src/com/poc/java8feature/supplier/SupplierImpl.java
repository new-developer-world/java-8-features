package com.poc.java8feature.supplier;

import java.util.function.Supplier;

public class SupplierImpl {
	
	public static void main(String[] args) {
				Supplier<String>sup=()->{
			String s="";
			
			for (int i=0;i<6;i++) {
				s=s+ (int)(Math.random()*10);
			}
	
		return s;
	};

	System.out.println(sup.get());
	System.out.println(sup.get());
	System.out.println(sup.get());
	System.out.println(sup.get());

}}
