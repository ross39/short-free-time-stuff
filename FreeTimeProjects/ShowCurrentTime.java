//this program shows the current time 
//I edited this is Vim
public class ShowCurrentTime {
	public static void main(String[] args) {
	//obtain the total milliseconds since midnight jan 1,1970
	long totalMilliseconds = System.currentTimeMillis();
	
	//obtain the total seconds since midnight, Jan 1, 1970
	long totalSeconds = totalMilliseconds / 1000;
	
	//Compute the current second in the minute in the hour 
	long currentSecond = totalSeconds % 60;
	
	//obtain the total minutes
	long totalMinutes = totalSeconds / 60;
	
	//compute the current Minute in the hour
	long currentMinute = totalMinutes % 60;
	
	//Obtain the total hours
	long totalHours = totalMinutes / 60;
	
	//compute the current hour
	long currentHour = totalHours % 24;
	
	//display results
	System.out.println("Current time is" + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}








}
