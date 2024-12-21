public class Musteri extends BaseEntity {
    private String email;

    public Musteri(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void BilgiGoster() {
        System.out.println("Müşteri tc: " + getId() + ", İsim: " + getName() + ", Email: " + email);
    }
}
