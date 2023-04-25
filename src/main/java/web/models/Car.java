package web.models;

public class Car {
    private String model;
    private String series;
    private int productionYear;

    public Car(String model, String series, int productionYear) {
        this.model = model;
        this.series = series;
        this.productionYear = productionYear;
    }
    public Car(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
