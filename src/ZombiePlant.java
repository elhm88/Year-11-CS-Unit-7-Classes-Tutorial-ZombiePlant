public class ZombiePlant {
    // properties
    private int maxPotency;
    private int treatmentsNeeded;

    // constructor
    public ZombiePlant(int maxPotency, int treatmentsNeeded) {
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    // methods
    public int getPotency() {
        return maxPotency;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        return (treatmentsNeeded > 0);
    }

    public void treat(int potency) {
        if (potency > 0 && potency <= maxPotency) {
            if (treatmentsNeeded > 0) {
                treatmentsNeeded--;
            }
        } else if (potency > maxPotency) {
            treatmentsNeeded++;
        }
    }
}