package sorveteriaDecorator;

public class ChipsDeChocolate extends Adicionais{

    public ChipsDeChocolate(Sorvete sorvete){
        this.sorvete = sorvete;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao()+" ,chips de chocolate";
    }

    @Override
    public double custo() {
        return sorvete.custo()+1.39;
    }
}
