public class App {
    public static void main(String[] args) throws Exception {
        Visitante v1 = new Visitante();
        v1.setNome("Marcio");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.toString());
    }
}
