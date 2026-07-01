package reminderApp_withSingleResponsibility.printer;

import java.util.List;

import reminderApp_withSingleResponsibility.Reminder;

public class ReminderPrinter {
	
	public void printReminders(List<Reminder> reminderList) {
		reminderList.forEach(System.out::println);
	}

}
