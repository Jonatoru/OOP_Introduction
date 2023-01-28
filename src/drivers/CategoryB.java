package drivers;

public class CategoryB extends Driver{
    /**
     * @param fullNameOfTheDriver   - ФИО водителя,
     * @param havingDriverIsLicense - Наличие водительских прав,
     * @param experience            - Стаж.
     */
    public CategoryB(String fullNameOfTheDriver, boolean havingDriverIsLicense, int experience) {
        super(fullNameOfTheDriver, havingDriverIsLicense, experience);
    }
}
