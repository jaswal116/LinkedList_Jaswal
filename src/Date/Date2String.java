package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2String {

	public static void main(String[] args) {
		
		//Creating Date in java with today's date.
		Date dateNow = new Date();
		
		//class - SimpleDateFormat
		//method - format(dateNow) : convert date to String
		
		//change date into string yyyyMMdd format example "20110914"
		SimpleDateFormat dateformatyyyyMMdd = new SimpleDateFormat("yyyyMMdd");
		String date_to_string = dateformatyyyyMMdd.format(dateNow);
		System.out.println("date into yyyyMMdd format: " + date_to_string);

		//converting  date into ddMMyyyy format example "14092011"
		SimpleDateFormat dateformatddMMyyyy = new SimpleDateFormat("ddMMyyyy");
		date_to_string = dateformatddMMyyyy.format(dateNow);
		System.out.println("Today's date into ddMMyyyy format: " + date_to_string);

		//change date to string on dd-MM-yyyy format e.g. "14-09-2011"
		SimpleDateFormat dateformatJava = new SimpleDateFormat("dd-MM-yyyy");
		date_to_string = dateformatJava.format(dateNow);
		System.out.println("Today's date into dd-MM-yyyy format: " + date_to_string);

		//converting date to string dd/MM/yyyy format for example "14/09/2011"
		SimpleDateFormat formatDateJava = new SimpleDateFormat("dd/MM/yyyy");
		date_to_string = formatDateJava.format(dateNow);
		System.out.println("Today's date into dd/MM/yyyy format: " + date_to_string);

		//date to dd-MMM-yy format e.g. "14-Sep-11"
		SimpleDateFormat ddMMMyyFormat = new SimpleDateFormat("MMM-dd-yy");
		date_to_string = ddMMMyyFormat.format(dateNow);
		System.out.println("Today's date into dd-MMM-yy format: " + date_to_string);

		//convert date to dd-MMMM-yy format e.g. "14-September-11"
		SimpleDateFormat ddMMMMyyFormat = new SimpleDateFormat("MMMM-dd-yyyy");
		date_to_string = ddMMMMyyFormat.format(dateNow);
		System.out.println("date into dd-MMMM-yy format: " + date_to_string); 


	}

}
