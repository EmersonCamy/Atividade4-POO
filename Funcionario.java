// Definição da classe chamada Funcionario que estende (herda) a classe BasePessoa.
public class Funcionario extends BasePessoa 
{
    private String contaCorrente;    // Número da conta corrente do funcionário
    private String registro;         // Número de registro do funcionário
    private String cracha;           // Número do crachá do funcionário

    // Declaração do construtor da classe Funcionario.
    public Funcionario(int codigo, String nome, String email, String telefone, String usuario, String senha, String contaCorrente, String registro, String cracha) 
    {
        super(codigo, nome, email, telefone, usuario, senha);
        this.contaCorrente = contaCorrente;   // Inicializa a conta corrente do funcionário
        this.registro = registro;             // Inicializa o número de registro do funcionário
        this.cracha = cracha;                 // Inicializa o número do crachá do funcionário
    }
}