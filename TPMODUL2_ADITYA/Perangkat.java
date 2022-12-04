public class Perangkat {
    protected String drive ;
    protected int  Ram ; 
    protected double processor;

    public Perangkat(String drive, int Ram, float processor){
        this.drive = drive;
        this.Ram = Ram;
        this.processor = processor;

    }
    public void informasi(){
        System.out.println("Perngakat Tanpa nama memiliki drive tipe "+drive+"dengan Ram"+Ram+ "GB Dan memiliki kecepatan processsor dengan kecepatan" +processor+ "GHZ");
    }
    
    
}
