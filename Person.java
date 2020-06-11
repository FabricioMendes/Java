/*
 * - Associados (ID, nome, Adress, number, CEP, neighborhood, city, UF, telefone, CPF/CNPJ, situação e número de associado).

- Colaborador (ID, nome, Adress, number, CEP, neighborhood, city, UF, telefone, CPF/CNPJ, cargo ou função).

- Fornecedores (ID, nome, Adress, number, CEP, neighborhood, city, UF, telefone, CPF/CNPJ, nome fantasia e website).

Assim, você deve criar as classes-modelo, utilizando técnicas com construtores e herança.
 */
package HeritageConstructor;

/**
 *
 * @author Fabricio Mendes
 *          11/06/2020
 * 
 */
public class Person {
    
    private int id;
    private String name;
    private String Adress;
    private double number;
    private double cep;
    private String neighborhood;
    private String city;
    private String state;
    private double phone;
    private double cpf_Cnpj;

    public Person(int id, String name, String Adress, double number, double cep, String neighborhood, String city, String state, double phone, double cpfCnpj) {
        this.id = id;
        this.name = name;
        this.Adress = Adress;
        this.number = number;
        this.cep = cep;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.cpf_Cnpj = cpfCnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getCep() {
        return cep;
    }

    public void setCep(double cep) {
        this.cep = cep;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public double getCpfCnpj() {
        return cpf_Cnpj;
    }

    public void setCpfCnpj(double cpfCnpj) {
        this.cpf_Cnpj = cpfCnpj;
    }
    
}
