package drivers;

public class CategoryC extends Driver{
    /**
     * @param fullNameOfTheDriver   - ФИО водителя,
     * @param havingDriverIsLicense - Наличие водительских прав,
     * @param experience            - Стаж.
     */
    public CategoryC(String fullNameOfTheDriver, boolean havingDriverIsLicense, int experience) {
        super(fullNameOfTheDriver, havingDriverIsLicense, experience);
    }
}
