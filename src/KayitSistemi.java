import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KayitSistemi implements IKayit {
    public List<Musteri> musteriler;
    public List<Film> filmler;
    public List<Salon> salonlar;

    public KayitSistemi() {
        this.musteriler = new ArrayList<>();
        this.filmler = new ArrayList<>();
        this.salonlar = new ArrayList<>();
    }

    @Override
    public void yeniMusteri(Musteri musteri) {
        musteriler.add(musteri);
    }

    @Override
    public void yeniFilm(Film film) {
        filmler.add(film);
    }

    @Override
    public void yeniSalon(Salon salon) {
        salonlar.add(salon);
    }

    public int sayFilmler(){
        return filmler.size();
    }
    public void listeleFilmler() {
        int index=0;
        for (Film film : filmler) {
            System.out.printf("Film index="+index+" "); 
            film.BilgiGoster();
            index++;
        }
        System.out.println();
    }

    public void listeleSalonlar() {
        int index = 0; 
        for (Salon salon : salonlar) {
            
            System.out.printf("Salon index="+index+" "); 
            salon.BilgiGoster();
            if (salon.getFilm() != null) {
                System.out.println("Müşteriler:");
                for (Musteri musteri : salon.getMusteriler()) {
                    musteri.BilgiGoster();
                }
            }
            System.out.println();
            index++;
        }
        System.out.println();
    }

    public void listeleMusteriler(){
        int index =0;
        for(Musteri musteri : musteriler){
            System.out.printf("musteri index="+index+" "); 
            musteri.BilgiGoster();
            index++;
        } 
    }

    public void salonSetFilm(Scanner scanner){
        listeleSalonlar();
        System.out.println("Salon index numarasini giriniz:");
        int salonIndex = scanner.nextInt();
        Salon salon = salonlar.get(salonIndex);
        listeleFilmler();
        System.out.println("film index numarasini giriniz:");
        int filmIndex = scanner.nextInt();
        Film film = filmler.get(filmIndex);
        salon.setFilm(film);
    }

    public void biletSat(Scanner scanner){
        listeleSalonlar();
        System.out.println("Salon index numarasini giriniz:");
        int salonIndex = scanner.nextInt();
        Salon salon = salonlar.get(salonIndex);
        listeleMusteriler();
        System.out.println("musteri index numarasini giriniz:");
        int musteriIndex = scanner.nextInt();
        Musteri musteri = musteriler.get(musteriIndex);
        salon.musteriEkle(musteri);
        

    }


}

