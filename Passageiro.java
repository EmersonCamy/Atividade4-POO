// Definição da classe chamada Passageiro que estende (herda) a classe BasePessoa.
public class Passageiro extends BasePessoa 
{
    private String numeroCartao;     // Número do cartão do passageiro
    private String documento;        // Documento de identificação do passageiro

    // Declaração do construtor da classe Passageiro.
    public Passageiro(int codigo, String nome, String email, String telefone, String usuario, String senha, String numeroCartao, String documento) 
    {
        super(codigo, nome, email, telefone, usuario, senha);
        this.numeroCartao = numeroCartao;     // Inicializa o número do cartão do passageiro
        this.documento = documento;           // Inicializa o documento de identificação do passageiro
    }
}