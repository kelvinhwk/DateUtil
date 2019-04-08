package com.kelvin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static boolean isToday(Calendar calendar) {
		Calendar now = Calendar.getInstance();
		if (now.get(Calendar.DAY_OF_YEAR) == calendar.get(Calendar.DAY_OF_YEAR)
				&& now.get(Calendar.YEAR) == calendar.get(Calendar.YEAR)) {
			return true;
		}
		return false;
	}

	public static Calendar strToCalendarToday() {
		Calendar now = Calendar.getInstance();

		now.set(Calendar.HOUR_OF_DAY, 0);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MILLISECOND, 0);
		return now;
	}

	public static Calendar strToCalendar_Date(String startDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d;
		try {
			d = sdf.parse(startDate);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		Calendar ret = Calendar.getInstance();
		ret.setTime(d);
		return ret;
	}

	public static Calendar strToCalendarAddNDays(int i) {
		Calendar today = strToCalendarToday();
		today.add(Calendar.DATE, i);
		return today;
	}

	public static Calendar strToCalendar_DateTime_Html5(String dateTime) {
		Date d = strToDate_DateTime_Html5(dateTime);
		Calendar ret = Calendar.getInstance();
		ret.setTime(d);
		return ret;
	}
	
	public static Date strToDate_DateTime_Html5(String dateTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		try {
			return sdf.parse(dateTime);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public static String toTimeStrHtml5(Calendar startTime) {
		return toTimeStrHtml5(startTime.getTime());
	}
	
	public static String toTimeStrHtml5(Date startTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		return sdf.format(startTime);
	}

	public static String toDateStr(Calendar startDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(startDate.getTime());
	}
	
	public static String toDateStr(Date startDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(startDate);
	}
}
