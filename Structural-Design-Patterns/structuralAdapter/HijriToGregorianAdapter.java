package structuralAdapter;

import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;

public class HijriToGregorianAdapter implements Calendar{
    private HijriCalendar hijriCalendar;

    public HijriToGregorianAdapter(HijriCalendar hijriCalendar) {
        this.hijriCalendar = hijriCalendar;
    }

    @Override
    public void displayDate() {
        HijrahDate hijrahDate = HijrahDate.of(hijriCalendar.getYear(), hijriCalendar.getMonth(), hijriCalendar.getDay());
        LocalDate gregorianDate = LocalDate.from(hijrahDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
        String formattedDate = gregorianDate.format(formatter);
        System.out.println("Gregorian date: " + formattedDate);

    }
}
