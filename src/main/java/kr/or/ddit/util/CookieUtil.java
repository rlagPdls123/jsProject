package kr.or.ddit.util;

public class CookieUtil {
	
	public static String getCookie(String cookieString, String cookieId) {
		
		String[] cookies = cookieString.split("; ");
		
		for(String cookie : cookies) {
			String[] cookieNmVal = cookie.split("=");
			
			if(cookieNmVal[0].equals(cookieId)) {
				return cookieNmVal[1];
			}
		}
		
		return null;
	}
}
