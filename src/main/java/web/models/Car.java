package web.models;

public class Car {
    private String model;
    private String country;
    private int series;

    public Car(String model, String country, int series) {
        this.model = model;
        this.country = country;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car " +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", country=" + country +
                '.';
    }
}
