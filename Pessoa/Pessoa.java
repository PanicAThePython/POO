
/**
 * @author natália
 */
public class Pessoa
{
    private String nome;
    private String sexo;
    private String dataNasc;
    private String estadoCivil;

    /**
     * Construtor para objetos da classe Pessoa
     */
    public Pessoa(String nome, String sexo, String dataNasc)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.estadoCivil = "solteiro";
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public void setEstadoCivil(String estado){
        this.estadoCivil = estado;
    }
}
