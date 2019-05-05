package Marathon.Enums;

public enum WeekDays {
    MONDAY("40"),
    TUESDAY("32"),
    WENSDAY("24"),
    THURSDAY("16"),
    FRIDAY("8"),
    SUTURDAY("Выходной"),
    SUNDAY("Выходной");


    public String getHour() {
        return hour;
    }

    private String hour;


    WeekDays(String _hour) {
        this.hour = _hour;
    }

}
