package transport;

public enum LoadCapacity {
    N1(0, 3.5),
    N2(3.6, 12),
    N3 (12.1, 100);
    private final double min;
    private final double max;

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    LoadCapacity (double min, double max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "Грузоподъемность " +
                "min: " + min + "; " +
                "max: " + max;
    }
}
