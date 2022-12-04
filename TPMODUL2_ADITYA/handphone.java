public class handphone extends Perangkat {
    protected boolean Fingerprint;
    protected String teks;

    public handphone(String drive, int Ram, float processor) {
        super(drive, Ram, processor);
       
    }

    @Override
    public void informasi(){
        if(Fingerprint==true){
            teks="ada Fingerprint";

        }
        else{
            teks="Tidak ada Fingerprint";
        }
        System.out.println("Hanphone ini mempunyai Drive Tipe" + drive + "dengan Ram sebesar" + Ram + "GB dan proscessor dengan keceapatan" + processor + "HZ Selain itu Hanphone in "+ teks );
    }
    public void telfon(int no_hp){
        System.out.println("Hanphone ini berhasil menyambungkan telefon ke no" +no_hp);
    }
    public void kirimsms(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS KE NO" +no_hp);
    }
    public void kirimsms(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS KE NO" +no_hp1+ "Dan juga ke no" +no_hp2);
    }


    }
