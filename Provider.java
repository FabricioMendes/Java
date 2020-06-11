/*
 *Fornecedores (ID, nome, Adress, nember, CEP, bairro, cidade, UF, telefone, CPF/CNPJ, nome fantasia e website).
 */
package HeritageConstructor;

/**
 *
 * @author Fabricio Mendes
 *          11/06/2020
 */
public class Provider extends Person{
    
    private String nameFantasy;
    private String site;

    public Provider(String nameFantasy, String site, int id, String name, String Adress, double number, double cep, String neighborhood, String city, String state, double phone, double cpfCnpj) {
        super(id, name, Adress, number, cep, neighborhood, city, state, phone, cpfCnpj);
        this.nameFantasy = nameFantasy;
        this.site = site;
    }

    public String getNameFantasy() {
        return nameFantasy;
    }

    public void setNameFantasy(String nameFantasy) {
        this.nameFantasy = nameFantasy;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
}

