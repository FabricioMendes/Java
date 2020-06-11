/*
 * Colaborador (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone, CPF/CNPJ, cargo ou função).
 */
package HeritageConstructor;

/**
 *
 * @author Fabricio Mendes
 *          11/06/2020
 */
public class Collaborator extends Person {
    
    private String cargo;
    private String funcao;

    public Collaborator(String cargo, String funcao, int id, String name, String Adress, double number, double cep, String neighborhood, String city, String state, double phone, double cpfCnpj) {
        super(id, name, Adress, number, cep, neighborhood, city, state, phone, cpfCnpj);
        this.cargo = cargo;
        this.funcao = funcao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
