package reminderApp_withoutSOLID;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		Reminder reminder = new Reminder();
		Reminder reminder1 = new Reminder(101,"Play cricket",LocalDateTime.of(2025,07,01,14,00));
		Reminder reminder2 = new Reminder(102,"Code for 3 hours",LocalDateTime.of(2025,07,01,15,00));
		
		reminder.addReminder(reminder1);
		reminder.addReminder(reminder2);
		
		System.out.println(reminder.getList());
		
		reminder.saveReminders("tuesDay reminders");

	}

}
