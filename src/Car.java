public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    /** Создаю конструктор для автомобилей
     *
     * @param brand - марка
     * @param model - модель
     * @param engineVolume - объём двигателя
     * @param color - цвет
     * @param year - год
     * @param country - страна проиводитель
     */
    public Car (String brand, String model, double engineVolume, String color, int year, String country){
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
        this.model = model == null || model.isBlank() ? "default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.color = color == null || color.isBlank() ? "белый" : color;
        this.year = year <= 0 ? 2000 : year;
        this.country = country == null || country.isBlank() ? "default" : country;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return  this.model;
    }

    public double getEngineVolume(){
        return this.engineVolume;
    }

    public String getColor(){
        return this.color;
    }

    public int getYear(){
        return this.year;
    }

    public String getCountry(){
        return  this.country;
    }

    /** Переписал toString под ноав данные
     *
     * @return было brand+" "+ model+ ", год выпуска: "+ year+ ", страна производства: "+ country+ ", цвет: "+ color+ ", объём двигателя: "+ engineVolume+ ".";
     */
    public String toString(){
        return getBrand()+" "+ getModel()+ ", год выпуска: "+ getYear()+ ", страна производства: "+ getCountry()+ ", цвет: "+ getColor()+ ", объём двигателя: "+ getEngineVolume()+ ".";
    }
}