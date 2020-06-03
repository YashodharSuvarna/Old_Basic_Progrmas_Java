package com.dates.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Dateoffic {
	public static void main(String[] args) throws ParseException {
		Calendar cal = (Calendar) Calendar.getInstance();

		Calendar firstPaymentDate = cal.getInstance();

		Calendar deliveryDate = Calendar.getInstance();

		if (firstPaymentDate != null && deliveryDate != null) {

			Integer monthsDeferredDW = 0;
			int monthsDeferred = (monthsDeferredDW == null ? 0 : monthsDeferredDW.intValue());
			monthsDeferred = monthsDeferred - 1 > 0 ? monthsDeferred - 1 : 0;

			Calendar lowerDateRange = (Calendar) deliveryDate.clone();
			System.out.println(lowerDateRange.getTime());

			Calendar upperDateRange = (Calendar) deliveryDate.clone();

			lowerDateRange.add(Calendar.MONTH, monthsDeferred);
			upperDateRange.add(Calendar.MONTH, monthsDeferred);

			lowerDateRange.add(Calendar.DATE, 10);
			System.out.println("Before"+lowerDateRange.getTime());
			
			upperDateRange.add(Calendar.DATE, 9);
			System.out.println("After"+upperDateRange.getTime());

			if (lowerDateRange.after(upperDateRange))
				System.out.println("after");
		}
		
		}
	}


