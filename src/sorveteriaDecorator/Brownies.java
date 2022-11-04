package sorveteriaDecorator;

public class Brownies extends Adicionais{

    public Brownies(Sorvete sorvete){
        this.sorvete = sorvete;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao()+" ,brownies";
    }

    @Override
    public double custo() {
        return sorvete.custo()+0.99;
    }
}
