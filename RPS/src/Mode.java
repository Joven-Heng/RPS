public enum Mode {
    AI_VS_AI("1. Watch the AI play"),
    AI_VS_HUMAN("2. Play against a computer");

    private final String textRepresentation;

    private Mode(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    @Override public String toString() {
        return textRepresentation;
    }
}
