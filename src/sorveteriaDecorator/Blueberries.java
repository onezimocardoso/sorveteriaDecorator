package sorveteriaDecorator;

public class Blueberries extends Adicionais{

    public Blueberries(Sorvete sorvete){
        this.sorvete = sorvete;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao()+" ,blueberries";
    }

    @Override
    public double custo() {
        return sorvete.custo()+1.10;
    }
}
