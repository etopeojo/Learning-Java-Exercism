import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDateDescription, parser);
        return dateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int timeHour = appointmentDate.getHour();
        return timeHour >= 12 && timeHour < 18;

    }

    public String getDescription(LocalDateTime appointmentDate) {
        String dayOfWeek = appointmentDate.getDayOfWeek().toString();
        dayOfWeek = dayOfWeek.charAt(0) + dayOfWeek.substring(1).toLowerCase();
        DateTimeFormatter printerForDate = DateTimeFormatter.ofPattern("MMMM d, YYYY");
        DateTimeFormatter printerForTime = DateTimeFormatter.ofPattern("h:mm a");
        String dateFormating = printerForDate.format(appointmentDate);
        String timeFormating = printerForTime.format(appointmentDate);

        return "You have an appointment on " + dayOfWeek + ", " + dateFormating + ", at " + timeFormating + ".";
    }

    public LocalDate getAnniversaryDate() {
        int thisYear = LocalDate.now().getYear();
        return LocalDate.of(thisYear, 9, 15);
    }
}
