public class Menulunes extends Menu implements restaurante {
private String postre;

    public Menulunes() {
    }

    public Menulunes(String plato, String bebida) {
        super(plato, bebida);
    }

    public Menulunes(String postre) {
        this.postre = postre;
    }

    public Menulunes(String plato, String bebida, String postre) {
        super(plato, bebida);
        this.postre = postre;
    }

    @Override
    public void menus() {

    }

    @Override
    public boolean queda() {
        System.out.println("si queda");
        return false;
    }


    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }
}
