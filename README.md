# MYsinema

MYsinema, Java ile geliştirilmiş bir sinema sistemi uygulamasıdır. Bu proje, film ve müşteri yönetimi gibi temel sinema sistemleri işlemlerini gerçekleştirmek için tasarlanmıştır. Eğitim veya portföy projeleri için kullanılabilir.

## Özellikler

- **Film Yönetimi**: Filmler için bilgi depolama ve listeleme.
- **Müşteri Yönetimi**: Müşteri bilgilerini kaydetme ve yönetme.
- **Salon Yönetimi**: Sinema salonlarını tanımlama ve düzenleme.
- **Kayıt Sistemi**: Filmler, müşteriler ve salonlar arasında ilişki kurma.

## Proje Yapısı

```plaintext
MYsinema
├── src
│   ├── BaseEntity.java      # Temel sınıf
│   ├── Film.java            # Film bilgileri
│   ├── IKayit.java          # Kayıt sistemi arayüzü
│   ├── KayitSistemi.java    # Kayıt işlemleri
│   ├── Main.java            # Uygulamanın giriş noktası
│   ├── Musteri.java         # Müşteri sınıfı
│   └── Salon.java           # Salon bilgileri
└── .vscode                  # Geliştirme ortamı ayarları
```

## Gereksinimler

- **Java Development Kit (JDK)** 8 veya üzeri
- Bir Java IDE (Örneğin: IntelliJ IDEA, Eclipse veya Visual Studio Code)

## Kurulum

1. **Projeyi klonlayın:**
   ```bash
   git clone <proje-repo-url>
   cd MYsinema
   ```

2. **IDE ile açın:**
   - Klasörü IDE'nize yükleyin.
   - Gerekli bağımlılıkların yüklü olduğundan emin olun.

3. **Çalıştırın:**
   - Main.java dosyasını çalıştırarak uygulamayı başlatabilirsiniz.

## Kullanım

1. Projeyi çalıştırın.
2. Menüden film, müşteri ve salon işlemlerini seçin.
3. Kayıt işlemlerini gerçekleştirin.

## Katkıda Bulunma

1. Projeyi forklayın.
2. Yeni bir dal (branch) oluşturun:
   ```bash
   git checkout -b ozellik/YeniOzellik
   ```
3. Değişikliklerinizi yapıp commit edin:
   ```bash
   git commit -m 'Yeni bir özellik eklendi'
   ```
4. Dalınızı push'layın:
   ```bash
   git push origin ozellik/YeniOzellik
   ```
5. Pull request açın.

## Lisans

Bu proje MIT lisansı ile lisanslanmıştır. Daha fazla bilgi için [LICENSE](LICENSE) dosyasına bakabilirsiniz.

---

Bu proje, temel Java becerilerini geliştirmek ve sinema sistemi modellemesi yapmak isteyenler için uygundur. Herhangi bir sorunuz olursa, lütfen iletişime geçin!
