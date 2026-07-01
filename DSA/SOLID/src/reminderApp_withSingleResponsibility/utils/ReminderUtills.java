package reminderApp_withSingleResponsibility.utils;

import reminderApp_withSingleResponsibility.Reminder;
import java.util.ArrayList;
import java.util.List;

public class ReminderUtills {
	public static List<Reminder> list = new ArrayList<>();
	
	public void addReminder(Reminder reminder) {
		list.add(reminder);
	}
	public void removeReminder(int reminderId) {
		
		Reminder deleteReminder = null;
		for(Reminder reminder : list) {
			if(reminder.getReminderId()==reminderId) {
				deleteReminder=reminder;
			}
			list.remove(deleteReminder);
			
		}
	}
	

}

 