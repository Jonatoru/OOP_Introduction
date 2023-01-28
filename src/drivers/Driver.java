package drivers;
import static Checks.ValidationUtilities.validateString;
import static Checks.ValidationUtilities.validateBoolean;

public abstract class Driver {
    private String fullNameOfTheDriver;
    private boolean havingDriverIsLicense;
    private int experience;

    /**
     * @param fullNameOfTheDriver - ФИО водителя,
     * @param havingDriverIsLicense - Наличие водительских прав,
     * @param experience - Стаж.
     */

    public Driver(String fullNameOfTheDriver, boolean havingDriverIsLicense, int experience) {
        this.fullNameOfTheDriver = validateString(fullNameOfTheDriver, "ABC");
        this.havingDriverIsLicense = validateBoolean(havingDriverIsLicense);
        this.experience = experience;
    }

    public String getFullNameOfTheDriver() {
        return fullNameOfTheDriver;
    }

    public void setFullNameOfTheDriver(String fullNameOfTheDriver) {
        this.fullNameOfTheDriver = fullNameOfTheDriver;
    }

    public boolean isHavingDriverIsLicense() {
        return havingDriverIsLicense;
    }

    public void setHavingDriverIsLicense(boolean havingDriverIsLicense) {
        this.havingDriverIsLicense = havingDriverIsLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void startMoving(){
        System.out.println("Начал движение");
    }

    public void stay(){
        System.out.println("Остановился");
    }

    public  void refuelTheCar(){
        System.out.println("Заправлю авто");
    }

    @Override
    public String toString() {
        return "Водитель: "+ getFullNameOfTheDriver() + ", со стажем вождения: " + getExperience();
    }
}
