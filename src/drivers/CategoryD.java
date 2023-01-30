package drivers;

public class CategoryD extends Driver{
    /**
     * @param fullNameOfTheDriver   - ФИО водителя,
     * @param havingDriverIsLicense - Наличие водительских прав,
     * @param experience            - Стаж.
     */
    public CategoryD(String fullNameOfTheDriver, boolean havingDriverIsLicense, int experience) {
        super(fullNameOfTheDriver, havingDriverIsLicense, experience);
    }
}
