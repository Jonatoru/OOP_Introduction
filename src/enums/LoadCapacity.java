package enums;

public enum LoadCapacity {
    N1(3.5F, 0),
    N2(3.5F,12.0F),

    N3(0, 12.0F);
    private Float maxLoadCapacity;
    private Float minLoadCapacity;

    LoadCapacity(float minLoadCapacity, float maxLoadCapacity) {
        this.minLoadCapacity = minLoadCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public float getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public float getMinLoadCapacity() {
        return minLoadCapacity;
    }

    @Override
    public String toString() {
        if (getMaxLoadCapacity() == 0){
            return "Грузоподъёмность: до "+ getMinLoadCapacity()+" тонн.";
        }
        else if (getMinLoadCapacity() == 0){
            return "Грузоподъёмность: свыше "+ getMaxLoadCapacity()+" тонн.";
        } else
        return "Грузоподъёмность: от "+ getMinLoadCapacity() +" до " + getMaxLoadCapacity() +" тонн.";
    }
}
