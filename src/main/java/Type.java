public enum Type {
    PIPER(6),
    CESSNA(8),
    ANTONOV(1),
    BEECHCRAFT(5),
    PILATUS(9);

    private final int capacity;

    Type(int capacity){
        this.capacity = capacity;
    }

    public int planeCapacity(){
        return this.capacity;
    }
}
