package sorveteriaDecorator;

public class Banana extends Adicionais{

    public Banana(Sorvete sorvete){
        this.sorvete = sorvete;
    }

    @Override
    public String getDescricao() {
        return sorvete.descricao+" ,banana";
    }

    @Override
    public double custo() {
        return sorvete.custo()+0.70;
    }
}
