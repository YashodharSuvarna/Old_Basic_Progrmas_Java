package com.supplier.example;

import java.util.function.Supplier;

//Demo Program-3 For Supplier to supply 6-digit Random OTP:
public class Supplier2 {
	public static void main(String[] args) {
		Supplier<String> otps = () -> {
			String otp= "";
			for(int i =1;i<=6;i++){
				otp=otp+(int)(Math.random()*10);
			}
			return otp;			
		};
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
	}
}
