package structuralAdapter;

public class Main {
    public static void main(String[] args) {
        HijriCalendar ramandanFirst = new HijriCalendar(1, 9, 1445);
        ramandanFirst.displayHijriDate();

        Calendar ramandanFirstInMiladi = new HijriToGregorianAdapter(ramandanFirst);

        ramandanFirstInMiladi.displayDate();
    }
}
