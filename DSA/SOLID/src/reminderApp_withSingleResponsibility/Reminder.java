package reminderApp_withSingleResponsibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder {
	private int reminderId;
	private String note;
	private LocalDateTime time;
	
	public static List<Reminder> list = new ArrayList<>();
	
	public void addReminder(Reminder reminder) {
		list.add(reminder);
	}
	
	public 	void saveReminders(String fileName) throws FileNotFoundException {
		//D:\fullstack_java_developer\DSA\SOLID
		File file = new File("D:\\fullstack_java_developer\\DSA\\SOLID\\"+fileName);
		PrintStream writter = new PrintStream(file);
		for(Reminder reminder :list) {
			writter.println(reminder.toString());
		}
		writter.close();
	}
	
	public Reminder(int reminderId, String note, LocalDateTime time) {
		super();
		this.reminderId = reminderId;
		this.note = note;
		this.time = time;
	}



	public Reminder() {
		// TODO Auto-generated constructor stub
	}

	public int getReminderId() {
		return reminderId;
	}


	public void setReminderId(int reminderId) {
		this.reminderId = reminderId;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public LocalDateTime getTime() {
		return time;
	}


	public void setTime(LocalDateTime time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "Reminder [reminderId=" + reminderId + ", note=" + note + ", time=" + time + "]";
	}
	
	
	
}
