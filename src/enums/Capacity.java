package enums;

public enum Capacity {
    ESPECIALLY_SMALL(0, 10),
    SMALL(0, 25),
    AVERAGE(25, 50),
    BIG(50, 80),
    EXTRA_LARGE(80, 120);

    Integer bottomLine;
    Integer upperBound;

    Capacity(Integer bottomLine, Integer upperBound) {
        this.bottomLine = bottomLine;
        this.upperBound = upperBound;
    }

    public Integer getBottomLine() {
        return bottomLine;
    }

    public Integer getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        if (getBottomLine() == 0){
            return "Вместимость: "+ getUpperBound() +" мест.";
        } else
        return "Вместимость: "+ getBottomLine() +" - "+ getUpperBound() +" мест.";
    }
}
