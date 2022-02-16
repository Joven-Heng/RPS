public enum AssetType{
    ROCK("1. Rock"),
    PAPER("2. Paper"),
    SCISSORS("3. Scissors");

    private final String textRepresentation;

    AssetType(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    @Override public String toString() {
        return textRepresentation;
    }
}
