class Votacao {
    int secao;
    int candidato;
    
    Votacao() {
        this(0, 0);
    }
    
    Votacao (int NumeroSecao, int NumeroCandidato) {
        secao = NumeroSecao;
        candidato = NumeroCandidato;
    }
}
