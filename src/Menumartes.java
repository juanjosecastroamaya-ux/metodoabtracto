public class Menumartes extends Menu implements restaurante {
    private String entrada;

    public Menumartes() {
    }

    public Menumartes(String plato, String bebida) {
        super(plato, bebida);
    }

    public Menumartes(String entrada) {
        this.entrada = entrada;
    }

    public Menumartes(String plato, String bebida, String entrada) {
        super(plato, bebida);
        this.entrada = entrada;
    }

    @Override
    public void menus() {

    }

    @Override
    public boolean queda() {
        System.out.println("si queda");
        return false;
    }



    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

}

