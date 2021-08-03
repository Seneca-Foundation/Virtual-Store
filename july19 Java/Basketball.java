public class Basketball extends Storeitem {

    private String Date;
    private String Section;
    private String Seat;

    public Basketball(float price, String name, String description, int itemNum) {
        super(price, name, description, itemNum);
        // TODO Auto-generated constructor stub
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