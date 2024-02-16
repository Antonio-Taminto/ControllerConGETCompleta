package com.example.ControllerConGETCompleta;

public class User {
    private String nome;
    private String luogo;
    private String saluto;
    public User(String nome,String luogo){
        this.nome = nome;
        this.luogo = luogo;
        //this.saluto = "Ciao "+nome+", com'è il tempo in "+luogo+"?";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }
    public void dichiaraSaluto(){
        saluto = "Ciao "+nome+", com'è il tempo in "+luogo+"?";
    }
}
