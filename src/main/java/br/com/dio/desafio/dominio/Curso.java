package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private  Avaliacao avaliacao;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void realizarAvaliacao(int nota){
        this.getAvaliacao().setNota(nota);
    }
   public boolean cursoConcluido(){
        if(this.avaliacao.aprovado()) return true;
        return false;
   }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
