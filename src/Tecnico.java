public class Tecnico extends Aluno{
    private int registroProfissional;

    public void praticar(){
        System.out.println("O(A) técnico(a) em " + this.getCurso() + " "+ this.getNome() + " está praticando");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
