public class Basketball extends WeightItem 
{

    private String Date;
    private String Section;
    private String Seat;

    public Basketball(float price, String name, String description, int itemNum, int weight) {
        super(price, name, description, itemNum, weight);
        
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String seat) {
        this.Seat = seat;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        this.Section = section;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }
}