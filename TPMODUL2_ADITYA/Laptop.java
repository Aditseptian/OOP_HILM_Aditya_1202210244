public class Laptop extends Perangkat{
    protected boolean webcam;
    protected String teks;
    public Laptop(String drive, int Ram, float processor) {
        super(drive, Ram, processor);
        
    }
    @Override
    public void  informasi() {
        if (webcam==true){
            teks="ada webcam";
        }
        else{
            teks="Tidak Memiliki WEbcam";
        }
        System.out.println("Laptop ini memiliki Drive Bertipe" + drive + "Dengan Ram Sebesar " + Ram + "Gb dan processor kecepatan" +processor+ "GHZ,Sselain itu laptop ini juga"+teks);
        
    }
    public void bukagame(String nama_game){
        System.out.println("Laptop ini dapat membuka game"+nama_game);
    }
    public void kirimemail(String email){
        System.out.println("Laptop berhasil mengirim email ke" +email);
    }
    public void kirimemail(String email,String email_2){
        System.out.println("Laptop ini berhasil menirim email kepada" + email + "dan ke" +email_2);
    }
}
