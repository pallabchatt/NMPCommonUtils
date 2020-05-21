package com.tcs.nmp.utils;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.api.services.prediction.model.Output.OutputMulti;

public class NMPUtility implements Comparator<OutputMulti> {
	@Override
	public int compare(OutputMulti output1, OutputMulti output2) {
		return output1.getScore().compareTo(output2.getScore());
	}
	
	/**
	 * Utility Method to validate email address
	 * @param email
	 * @return boolean
	 */
	public static Boolean validateEmail(String email){
    	boolean isValidFlag = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValidFlag = true;
        }
        return isValidFlag;
    }
	
	/**
	 * Utility Method to check if a String is NULL or Blank
	 * @param inputString
	 * @return
	 */
	public static boolean isStringNullOrNotBlank(String inputString){
		boolean flag = false;
		if(null!=inputString && !inputString.isEmpty() && !"NULL".equalsIgnoreCase(inputString)){
			flag = true;
		}
		
		return flag;
	}
	
	/**
	 * 
	 * @param identifierMap
	 * @param inputMessage
	 * @return
	 */
	public static String formatMessage(Map<String, String> identifierMap, String inputMessage){
		String formattedMessage = inputMessage;
		if(isStringNullOrNotBlank(formattedMessage) && !identifierMap.isEmpty()){
			for(final String key:identifierMap.keySet()){
				formattedMessage = formattedMessage.replace(key, identifierMap.get(key));
			}
		}
		return formattedMessage;
	}
	
	/**
	 * 
	 * @return
	 */
	public static String createSalutation(){
		StringBuffer saluteString = new StringBuffer("Good ");
		Date date = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(date);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<=12){
			saluteString.append("Morning ");
		}else if(hour<=18){
			saluteString.append("Afternoon ");
		}else{
			saluteString.append("Evening ");
		}
		return saluteString.toString();
		
	}
	
	/**
	 * 
	 * @return
	 */
	public static String createGreetings(){
		StringBuffer saluteString = new StringBuffer("Have a Good ");
		Date date = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(date);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<=18){
			saluteString.append("Day");
		}else{
			saluteString.append("Evening");
		}
		return saluteString.toString();
		
	}
	
}
