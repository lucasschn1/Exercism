import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        // Creating the formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Parse method to read the string
        LocalDateTime parsed = LocalDateTime.parse(appointmentDateDescription, formatter);

        return parsed;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedPattern("EEEE, MMMM d , yyyy 'at' h:mm a");
        String formattedDate = appointmentDate.format(formatter);

        return "You have a appointment on " + formattedDate + ".";
    }

    public LocalDate getAnniversaryDate() {
       return LocalDate.of(LocalDate.now().getYear(), 9,15);
    }
}
