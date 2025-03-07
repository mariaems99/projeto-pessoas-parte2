public class App {
    public static void main(String[] args) throws Exception {
        Visitante v1 = new Visitante();
        v1.setNome("Marcio");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Aline");
        a1.setIdade(18);
        a1.setSexo("F");
        a1.setMatricula(1455);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1452);
        b1.setNome("Copélia");
        b1.setIdade(19);
        b1.setBolsa(100.0f);
        b1.setSexo("F");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

        Professor p1 = new Professor();
        p1.setNome("Helena");
        p1.setIdade(40);
        p1.setSexo("F");
        p1.setSalario(6000);
        p1.setEspecialidade("Engenharia de Software");
        p1.receberAumento(1000f);
        System.out.println(p1.toString());

        Tecnico t1 = new Tecnico();
        t1.setNome("Olivia");
        t1.setIdade(27);
        t1.setSexo("F");
        t1.setRegistroProfissional(8542);
        t1.setCurso("Desenvolvimento de Sistemas");
        t1.praticar();
        t1.toString();
    }
}
