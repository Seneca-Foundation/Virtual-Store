public class Basketball extends WeightItem 
{

    private String Date;
    private String Section;
    private String Seat;

    public Basketball(String name, double price, String description, String date, double weight, int itemNum) {
        super(name, price, description, weight, itemNum);
        this.Date = date;
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
    public String GetData(){
        return "Match: " + name + ", Price: $" + price + ", Date: " + Date + ", Section: " + Section + ", Seat: " + Seat + ", Weight: " + weight + ", Item Number: " + itemNum;
    }
}