package sorveteriaDecorator;

public class Maca extends Adicionais{

    public Maca(Sorvete sorvete){
        this.sorvete = sorvete;
    }

    public String getDescricao(){
        return sorvete.descricao+" maca, ";
    }

    public double custo(){
        return sorvete.custo()+1.49;
    }

}
