package enumExample;
public class CheckHoliday {
	// Method to check if the given day is a holiday
	public void checkHoliday(DaysOfWeek day) {
		if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
			System.out.println(day + " is holiday");
		} else
			System.out.println(day + " is not a holiday");
	}
	public static void main(String[] args) {
		// create an instance for checkHoliday method because it is non static
		CheckHoliday holidayChecker = new CheckHoliday();
		// Example usage
		holidayChecker.checkHoliday(DaysOfWeek.MONDAY);
		holidayChecker.checkHoliday(DaysOfWeek.SUNDAY);
	}
}
