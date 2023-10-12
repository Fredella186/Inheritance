public class Komputer {
    private String kode;
    private long harga;
    private Cpu cMerk;
    private Monitor mMerk;
    private Printer pMerk;
    
    public Komputer(String kode, long harga)
    {
        this.kode = kode;
        this.harga = harga;
        cMerk = new Cpu("Intel");//instance objek
        mMerk = new Monitor("Samsung");
        pMerk = new Printer("Epson");
    }
    
    public void DisplaySpec()
    {
        System.out.println("Kode : "  + this.kode);
        System.out.println("Merek Cpu : " + cMerk.getMerk());
        System.out.println("Merek Monitor: "+ mMerk.getMerk());
        System.out.println("Merek Printer: " + pMerk.getMerk());
        
        
    }

}
