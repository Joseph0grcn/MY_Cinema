
import java.util.Scanner;



public class Main {
        

    public static void main(String[] args) {
        
        KayitSistemi sistem = new KayitSistemi();
        Scanner scanner = new Scanner(System.in);

                // Örnek Veri
                Film film1 = new Film("Inception", 148, "Bilim Kurgu");
                Film film2 = new Film("Titanic", 195, "Romantik");

                sistem.yeniFilm(film1);
                sistem.yeniFilm(film2);

                Musteri musteri1 = new Musteri(111111, "Ahmet", "ahmet@example.com");
                Musteri musteri2 = new Musteri(222222, "Elif", "elif@example.com");

                sistem.yeniMusteri(musteri1);
                sistem.yeniMusteri(musteri2);

                Salon salon1 = new Salon(1, "Salon 1");
                salon1.setFilm(film1);
                salon1.musteriEkle(musteri1);

                Salon salon2 = new Salon(2, "Salon 2");
                salon2.setFilm(film2);
                salon2.musteriEkle(musteri2);

                sistem.yeniSalon(salon1);
                sistem.yeniSalon(salon2);


        int secim = 0;
        do{
            System.out.println("==============================");
            System.out.println("===MY Saloon__Sistem Menusu===");
            System.out.println("1. Yeni Musteri ");
            System.out.println("2. Yeni Film");
            System.out.println("3. Yeni Salon");
            System.out.println("4. Salon film duzenleme");
            System.out.println("5. Salon ve Filmleri listele");
            System.out.println("6. bilet sat");
            System.out.println("7. musterileri listele");



            System.out.println("0. cikis");
            System.out.print("Seciminiz:");
            secim = scanner.nextInt();
            scanner.nextLine();  // Bu satır önemli!
            System.out.println("");
            switch(secim){
                case 0:
                    secim =0;
                    break;
                case 1://yeni musteri
                    System.out.print("musteri adini giriniz: ");
                    String musteriAd = scanner.nextLine();

                    System.out.print("musteri tc no  giriniz: ");
                    Integer tc = scanner.nextInt();
                    scanner.nextLine();  // Bu satır önemli!

                    System.out.print("musteri email giriniz: ");
                    String email = scanner.nextLine();

                    createMusteri(sistem, musteriAd, tc, email);
                    break;
                case 2://yeni film
                    System.out.print("Film adini giriniz:");
                    String filmAd = scanner.nextLine();

                    System.out.print("Film suresini dk cinsinden giriniz:");
                    Integer sure = scanner.nextInt();
                    scanner.nextLine();  // Bu satır önemli!

                    System.out.print("Film turunu giriniz:");
                    String tur = scanner.nextLine();

                    createFilm(sistem,filmAd,sure,tur);
                    break;
                case 3://yeni salon
                    System.out.println("salon id giriniz:");
                    Integer salonId = scanner.nextInt();
                    scanner.nextLine();  // Bu satır önemli!

                    System.out.println("salon ismini giriniz:");
                    String salonIsmi = scanner.nextLine();
                    createSalon(sistem, salonIsmi, salonId);
                    break;

                case 4://salon set film
                    sistem.salonSetFilm(scanner);
                    
                    break;
                case 5://filmler salonlar gor
                    sistem.listeleFilmler();
                    sistem.listeleSalonlar();
                    break;
                case 6://bilet sat
                    sistem.biletSat(scanner);
                    break;
                case 7://musterileri listele
                    sistem.listeleMusteriler();
                    break;
                default:
                    System.out.println("belirtilen degerlerden birini giriniz");

            }
            System.out.println("Devam Etmek icin enter tusuna basiniz.");
            scanner.nextLine();
            System.out.println("");
        }while(secim != 0);
        scanner.close();

        
        
    }
    public static void createMusteri(KayitSistemi sistem, String ad,int tc, String email){
        Musteri musteri = new Musteri(tc, ad, email);
        sistem.yeniMusteri(musteri);
    }
    public static void createFilm(KayitSistemi sistem, String ad,int sure, String tur){
        Film film = new Film(ad, sure, tur);
        sistem.yeniFilm(film);
    }
    public static void createSalon(KayitSistemi sistem, String salonAd,int salonId){
        Salon salon = new Salon(salonId, salonAd);
        sistem. yeniSalon(salon);
    }
    
}
