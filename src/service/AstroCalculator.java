package service;
import java.lang.*;
import model.User;
public class AstroCalculator {
	public String findSign(User user) {
		if(user.getDob()==null || user.getEmail()==null || user.getGender()==null || user.getName()==null)
			return "Enter valid details";
		try {
			String date=user.getDob();
			String [] dateParts = date.split("-");
			String days = dateParts[0];
			String months = dateParts[1];
			int day=Integer.parseInt(days);
			int month =Integer.parseInt(months);
			String astro_sign=""; 
	        if (month == 12){ 
	              
	            if (day < 22) 
	            astro_sign = "Sagittarius"; 
	            else
	            astro_sign ="Capricorn"; 
	        } 
	              
	        else if (month == 01){ 
	            if (day < 20) 
	            astro_sign = "Capricorn"; 
	            else
	            astro_sign = "Aquarius"; 
	        } 
	              
	        else if (month == 02){ 
	            if (day < 19) 
	            astro_sign = "Aquarius"; 
	            else
	            astro_sign = "Pisces"; 
	        } 
	              
	        else if(month == 03){ 
	            if (day < 21)  
	            astro_sign = "Pisces"; 
	            else
	            astro_sign = "Aries"; 
	        } 
	        else if (month == 04){ 
	            if (day < 20) 
	            astro_sign = "Aries"; 
	            else
	            astro_sign = "Taurus"; 
	        } 
	              
	        else if (month == 05){ 
	            if (day < 21) 
	            astro_sign = "Taurus"; 
	            else
	            astro_sign = "Gemini"; 
	        } 
	              
	        else if( month == 06){ 
	            if (day < 21) 
	            astro_sign = "Gemini"; 
	            else
	            astro_sign = "Cancer"; 
	        } 
	              
	        else if (month == 07){ 
	            if (day < 23) 
	            astro_sign = "Cancer"; 
	            else
	            astro_sign = "Leo"; 
	        } 
	              
	        else if( month == 8){ 
	            if (day < 23)  
	            astro_sign = "Leo"; 
	            else
	            astro_sign = "Virgo"; 
	        } 
	              
	        else if (month == 9){ 
	            if (day < 23) 
	            astro_sign = "Virgo"; 
	            else
	            astro_sign = "Libra"; 
	        } 
	              
	        else if (month == 10){ 
	            if (day < 23) 
	            astro_sign = "Libra"; 
	            else
	            astro_sign = "Scorpio"; 
	        } 
	              
	        else if (month == 11){ 
	            if (day < 22) 
	            astro_sign = "Scorpio"; 
	            else
	            astro_sign = "Sagittarius"; 
	        } 
	        
	        return astro_sign; 
		}
		catch(Exception e) {
			return "Enter valid details";
		}
    } 

}