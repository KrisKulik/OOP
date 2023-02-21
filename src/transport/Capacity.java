package transport;

public enum Capacity {
    EXTRA_SMALL(1, 10),
    SMALL(1, 25),
    MEDIUM(25, 50),
    LARGE(50, 80),
    EXTRA_LARGE(80, 120);
    private int min;
    private int max;

    Capacity(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return  "Вместимость: " +
                "min: " + min + " " +
                "max: " + max;
    }
}
