public class Computer extends WeightItem 
{

    private String computerBrand;
    private String releaseDate;
    private String color;
    public Computer(String name, String color, float price, String computerBrand, String description, String releaseDate, int itemNum, int weight) {
        super(price, name, description, itemNum, weight);
        
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
        return "Product: " + name  + ", Color: " + color + ", Price: " + price + ", Computer Brand: "+ computerBrand + ", Description: " + description +  ", Release Date: " + releaseDate +  ", Item Number: " + itemNum;
    }
    
}
