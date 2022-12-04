public class Mainapp {
    public static void main(String[] args) throws Exception{
        Perangkat perangkat1 = new Perangkat("sandisk", 10, 6);
        perangkat1.informasi();
        System.out.println("");

        Laptop laptop1 = new Laptop("SSD", 16, 12);
        laptop1.informasi();
        laptop1.bukagame("Valorant");
        laptop1.kirimemail("tunduh@gmail.com");
        laptop1.kirimemail("yb@gmail.com", "yourbae@gmail.com");
        System.out.println("");

        handphone handphone1 = new handphone("mediatek", 6, 5);
        handphone1.informasi();
        handphone1.telfon(6289654);
        handphone1.kirimsms(62896543);
        handphone1.kirimsms(621345,  6257894);
        System.out.println("");
    }
}
