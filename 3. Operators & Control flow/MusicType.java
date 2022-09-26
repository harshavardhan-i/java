public enum MusicType {
    // Here the numbers are arguments to the constructor
    // defined below
    CLASSICAL(1), JAZZ(4), ROCK(6), METAL(11);
    private int earDamageFactor;

    // constructor
    private MusicType(int earDamageFactor){
        this.earDamageFactor = earDamageFactor;
    }

    public int calcHearingLoss(int hours){
        return hours * earDamageFactor;
    }

    // Ordinals are indexes of the enums defined
    // this.name() - gives string representation of the name
    public String toString() {
        return this.name() + " - " + this.ordinal() + " - " + this.earDamageFactor;
    }
}