public class iPhone implements Phone, IOS{
    
    public String processor(){
        return "A15";
    }

    public int spaceInGB(){
        return 256;
    }

    public String airdrop(){
        return "copy and paste anywhere";
    }
}