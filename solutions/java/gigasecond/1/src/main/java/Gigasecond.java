import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Gigasecond {
    int gigasecond = 1_000_000_000;
    LocalDateTime result;

    public Gigasecond(LocalDate moment) {
        // Converter LocalDate para LocalDateTime (00:00:00)
        LocalDateTime dateTime = moment.atStartOfDay();

        // converter data para segundos
        long seconds = dateTime.toEpochSecond(ZoneOffset.UTC);

        // Somar os segundos
        long totalSeconds = seconds + gigasecond;

        // Converter para LocalDate novamente
        result = LocalDateTime.ofEpochSecond(totalSeconds, 0, ZoneOffset.UTC);

    }

    public Gigasecond(LocalDateTime moment) {
        long seconds = moment.toEpochSecond(ZoneOffset.UTC);

        long totalSeconds = seconds + gigasecond;

        result = LocalDateTime.ofEpochSecond(totalSeconds, 0, ZoneOffset.UTC);
    }

    public LocalDateTime getDateTime() {
        return result;
    }
}
