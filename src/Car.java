public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public String toString(){
        return brand+" "+ model+ ", год выпуска: "+ year+ ", страна производства: "+ country+ ", цвет: "+ color+ ", объём двигателя: "+ engineVolume+ ".";
    }
}