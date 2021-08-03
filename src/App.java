public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");

        Computer tempcomp = new Computer("mac" ,"Red",500,"Apple", "M1 Chip,","2021" ,1);
        System.out.println(tempcomp.GetData());

    }
}
