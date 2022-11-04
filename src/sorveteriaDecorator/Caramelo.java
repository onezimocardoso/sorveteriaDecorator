package sorveteriaDecorator;

public class Caramelo extends Adicionais{

    public Caramelo(Sorvete sorvete){
        this.sorvete = sorvete;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao()+" ,caramelo";
    }

    @Override
    public double custo() {
        return sorvete.custo()+0.89;
    }
}
