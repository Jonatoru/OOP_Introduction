package mechanics;
import drivers.CategoryD;
import drivers.Driver;
import transport.Transport;

import static Checks.ValidationUtilities.validateString;

public class Mechanics {
    private String firstLastName;
    private String worksСompany;

    public Mechanics(String firstLastName, String worksСompany) {
        this.firstLastName = validateString(firstLastName, "Неуказана Фамилия и Имя");
        this.worksСompany = validateString(worksСompany,"Нет информации об компании");
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getWorksСompany() {
        return worksСompany;
    }

    public void setWorksСompany(String worksСompany) {
        this.worksСompany = worksСompany;
    }

    public <T extends Transport> void carryOutMaintenance(T t){
        System.out.println("Проводит техобслуживание транспорту: "+ t.getBrand()+ " "+ t.getModel() + " механик: "+ getFirstLastName()+ ".");
    }

    public <T extends Transport> void fixTheCar(T t){
        System.out.println("Чинет машину: "+ t.getBrand()+ " "+ t.getModel() + " механик: "+ getFirstLastName()+ ".");
    }

    @Override
    public String toString() {
        return "Фамилия и имя механика: " + getFirstLastName() + ", компания в которой работает: " + getWorksСompany() +".";
    }
}
