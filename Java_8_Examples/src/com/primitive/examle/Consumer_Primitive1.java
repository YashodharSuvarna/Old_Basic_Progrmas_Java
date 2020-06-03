package com.primitive.examle;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class Consumer_Primitive1 {
	public static void main(String[] args) {
		// Need of Primitive Functional
		Consumer<Integer> p = i -> System.out.println(i*i);
		 p.accept(3);

		
		// Demo Program for IntPredicate:
		IntConsumer c= i->System.out.println("The Square of i:"+(i*i)); 
		c.accept(10);
		
		
		
	}

}
