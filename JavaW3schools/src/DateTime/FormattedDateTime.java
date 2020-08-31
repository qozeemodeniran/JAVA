package DateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateTime {
	public static void main(String args[]) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Before formating: "+ dateTime);
		
		DateTimeFormatter dateTimeFormatted = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		
		String formattedDateTime = dateTime.format(dateTimeFormatted);
		System.out.println("After formatting: "+ formattedDateTime);
	}
}
