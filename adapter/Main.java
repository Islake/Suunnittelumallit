package adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();
        dateAdapter.setDay(1);
        dateAdapter.setMonth(1);
        dateAdapter.setYear(2024);
        System.out.println("Initial Date: " + dateAdapter.getDay() + "/" + dateAdapter.getMonth() + "/" + dateAdapter.getYear());

        dateAdapter.advanceDays(30);
        System.out.println("Date after advancing 30 days: " + dateAdapter.getDay() + "/" + dateAdapter.getMonth() + "/" + dateAdapter.getYear());
    }
}