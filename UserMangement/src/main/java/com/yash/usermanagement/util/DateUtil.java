package com.yash.usermanagement.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateUtil {

	public static Date utcNow(){
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		Calendar cal = Calendar.getInstance(TimeZone.getDefault());
		DateFormat formater = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
			return formater.parse(formater.format(cal.getTime()));
		} catch (ParseException e) {
			log.error(e.getMessage());
		}
		return null;
	}
}
