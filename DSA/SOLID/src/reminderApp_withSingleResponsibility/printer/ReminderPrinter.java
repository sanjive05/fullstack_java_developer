package reminderApp_withSingleResponsibility.printer;

import reminderApp_withSingleResponsibility.Reminder;

public class ReminderPrinter {
	
	public void printReminders() {
		Reminder.list.forEach(System.out::println);
	}

}
