package com.kelvin.util;

import java.util.Calendar;

public class DateUtil {

	public static boolean isToday(Calendar calendar) {
		Calendar now = Calendar.getInstance();
		if (now.get(Calendar.DAY_OF_YEAR) == calendar.get(Calendar.DAY_OF_YEAR)
				&& now.get(Calendar.YEAR) == calendar.get(Calendar.YEAR)) {
			return true;
		}
		return false;
	}
}
