// Definindo uma classe abstrata chamada BasePessoa.
public abstract class BasePessoa 
{
    protected int codigo;               // Código da pessoa
    protected String nome;             // Nome da pessoa
    protected String email;            // Endereço de e-mail da pessoa
    protected String telefone;         // Número de telefone da pessoa
    protected String usuario;          // Nome de usuário da pessoa
    protected String senha;            // Senha da pessoa

    // Faz a inicialização do código com as informações fornecidas.
    public BasePessoa(int codigo, String nome, String email, String telefone, String usuario, String senha) 
    {
        this.codigo = codigo;                     // Inicializa o código da pessoa
        this.nome = nome;                         // Inicializa o nome da pessoa
        this.email = email;                       // Inicializa o e-mail da pessoa
        this.telefone = telefone;                 // Inicializa o telefone da pessoa
        this.usuario = usuario;                   // Inicializa o nome de usuário da pessoa
        this.senha = senha;                       // Inicializa a senha da pessoa
    }
}