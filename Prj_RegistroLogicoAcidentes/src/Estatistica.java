class Estatistica {
    String codigo;
    String nome;
    int acidentes;
    
    Estatistica() {
        this(" " ," " , 0);
    }
    
    Estatistica(String CodigoCidade, String NomeCidade, int QtdAcidentes) {
        codigo = CodigoCidade;
        nome = NomeCidade;
        acidentes = QtdAcidentes;
    }
}
