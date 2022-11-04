package sorveteriaDecorator;

public class Sorveteria {
    public static void main(String[] args) {

        Sorvete sorvete = new SilkChocolate();
        sorvete = new Blueberries(sorvete);
        sorvete = new ChipsDeChocolate(sorvete);
        sorvete = new Brownies(sorvete);

        System.out.println(sorvete.getDescricao());
        System.out.printf("Valor a pagar $ %.2f  ",sorvete.custo());
    }
}
