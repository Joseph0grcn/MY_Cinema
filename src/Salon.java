import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity {
    private Film film;
    private List<Musteri> musteriler;

    public Salon(int id, String name) {
        super(id, name);
        this.musteriler = new ArrayList<>();
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    public List<Musteri> getMusteriler() {
        return musteriler;
    }

    @Override
    public void BilgiGoster() {
        System.out.println("Salon: " + getName() + ", Gösterimdeki Film: " + (film != null ? film.getAd() : "Yok"));
    }
}
