public class Basketball extends WeightItem 
{

    private String Date;
    private int Section;
    private int Seat;

    public Basketball(String name, double price, int section, int seat, String description, String date, double weight, int itemNum) {
        super(name, price, description, weight, itemNum);
        this.Date = date;
        this.Section = section;
        this.Seat = seat;
    }

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int seat) {
        this.Seat = seat;
    }

    public int getSection() {
        return Section;
    }

    public void setSection(int section) {
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