public enum LogLevel {
    TRC,
    DGB,
    INF,
    WRN,
    ERR,
    FTL,
    UNKNOWN;

    public int getEncodedLevel() {
        return switch (this) {
            case TRC -> 1;
            case DGB -> 2;
            case INF -> 4;
            case WRN -> 5;
            case ERR -> 6;
            case FTL -> 42;
            default -> 0;
        };
    }
}