package DecoratorP7Restaurant.Clase;

public class NotaDePlata implements NotaDePlataAbstract{
    private float total;
    private String data;

    public NotaDePlata(float total, String data) {
        this.total = total;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println("La data de: "+data+" a fost platita suma de: "+total+" lei.");
    }
}
