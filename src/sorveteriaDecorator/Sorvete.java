package sorveteriaDecorator;

public abstract class Sorvete {
    String descricao;

    public String getDescricao(){
        return descricao;
        }

    public abstract double custo();
}
