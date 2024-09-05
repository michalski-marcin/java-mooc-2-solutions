public class Literacy {

    private String country;
    private String year;
    private String sex;
    private Double percentage;

    public Literacy(String country, String year, String sex, Double percentage) {
        this.country = country;
        this.year = year;
        this.sex = sex;
        this.percentage = percentage;
    }

    public Double getPercent() {
        return percentage;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + sex + ", " + percentage;
    }
}
