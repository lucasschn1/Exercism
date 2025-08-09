public enum LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL,
    UNKNOWN;

    public int getEncodedLevel() {
        return switch (this) {
            case TRACE -> 1;
            case DEBUG -> 2;
            case INFO -> 4;
            case WARNING -> 5;
            case ERROR -> 6;
            case FATAL -> 42;
            default -> 0;
        };
    }
}