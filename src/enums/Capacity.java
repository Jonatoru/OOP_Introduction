package enums;

public enum Capacity {
    especiallySmall (0, 10),
    small (0, 25),
    average (25, 50),
    big (50, 80),
    extraLarge (80, 120);

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
