public enum LogLevel {
    TRACE(1,"TRC"),
    DEBUG(2,"DBG"),
    INFO(4,"INF"),
    WARNING(5,"WRN"),
    ERROR(6,"ERR"),
    FATAL(42,"FTL"),
UNKNOWN(0,"");

    private final int num;
    private final String readableValue;

    LogLevel(int num, String readableValue) {
        this.num = num;
        this.readableValue = readableValue;
    }

    public int getNum() {
        return num;
    }

    public String getReadableValue() {
        return readableValue;
    }

    public static LogLevel fromString(String readableValue) {
        for (LogLevel level : values()) {
            if (level.getReadableValue().equals(readableValue)) {
                return level;
            }
        }
        return UNKNOWN;
    }

}