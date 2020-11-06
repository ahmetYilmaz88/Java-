package Scheduler;

public class Appointment
{
	
	private DayOfWeek day;
	private String time;
	private String appointment;
		
	
		public Appointment(DayOfWeek day, String time, String appointment)
		{
			this.day=day;
			this.time=time;
			this.appointment=appointment;
		}
		
		@Override
		public String toString()
		{
			return "Appointment day:" + day+ " /n Appointment time: "+ time+ "/n Appointment detail "+ appointment;
		}
		
		public void setDay(DayOfWeek day)
		{
			this.day=day;
		}
		
		public DayOfWeek getDay()
		{
		return day;
		}
		
		public void setTime (String time) {
			       
			       if(Character.isDigit(time.charAt(0)) && Character.isDigit(time.charAt(1)) && Character.isDigit(time.charAt(2)) && Character.isDigit(time.charAt(3)))
			       {
			           if(time.toLowerCase().charAt(time.length()-1)=='a' || time.toLowerCase().charAt(time.length()-1)=='p')
			           {
			      
			        	   this.time=time;
					 
			           }
			       }
			       else
			       {
			           System.out.println("Invalid String. Numeric values must be followed with 'a' or 'p'");
			       }
			           
		}
		public String getTime()
		{
			return time;
		}
		
		public void setAppointment (String appointment)
		{
			
				this.appointment=appointment;
			
		}
		public String getAppointment()
		{
			return appointment;
		}

	}