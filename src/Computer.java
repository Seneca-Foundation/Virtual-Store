public class Computer extends WeightItem 
{

    private String computerBrand;
    private String releaseDate;
    private String color;
    public Computer(String name, double price, String color, String computerBrand, String description, String releaseDate, double weight, int itemNum) {
        super(name, price, description, weight, itemNum);
        this.computerBrand = computerBrand;
        this.releaseDate = releaseDate;
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getComputerBrand() {
        return computerBrand;
    }

    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }
    public String GetData()
    {
        return "Computer: " + name  +  ", Price: $" + price + ", Color: " + color + ", Computer Brand: "+ computerBrand + ", Description: " + description +  ", Release Date: " + releaseDate + ", Weight: "+ weight + " pounds, Item Number: " + itemNum;
    }
    
}
