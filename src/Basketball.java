public class Basketball extends WeightItem 
{

    private String date;
    private int section;
    private int seat;

    public Basketball(String name, double price, int section, int seat, String description, String date, double weight, int itemNum) {
        super(name, price, description, weight, itemNum);
        this.date = date;
        this.section = section;
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String GetData(){
        return "Match: " + name + ", Price: $" + price + ", Date: " + date + ", Section: " + section + ", Seat: " + seat + ", Weight: " + weight + ", Item Number: " + itemNum;
    }
}