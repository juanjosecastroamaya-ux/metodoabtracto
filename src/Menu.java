import java.util.ArrayList;

public abstract class Menu {

    private String plato;
    private String bebida;

    public Menu() {
    }

    public Menu(String plato, String bebida) {
        this.plato = plato;
        this.bebida = bebida;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
    //metodo concreto
    public void menudiario(){
        System.out.println("1.pasta y gaseosa");
    }
    public abstract void menus();
}
