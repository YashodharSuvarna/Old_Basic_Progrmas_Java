package com.primitive.examle;

import java.util.function.IntSupplier;

public class SupplierPrimitive1 {
	public static void main(String[] args) {
		IntSupplier s = () -> (int) (Math.random() * 10);
		String otp = "";
		for (int i = 1; i <= 6; i++) {
			otp = otp + s.getAsInt();
		}
		System.out.println("The 6 digit OTP: " + otp);

	}

}
