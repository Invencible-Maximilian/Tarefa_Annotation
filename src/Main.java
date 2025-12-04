public class Main {
    public static void main(String[] args) {

        // Obtém a classe
        Class<?> clazz = ClasseComTabela.class;

        // Verifica se a classe possui a annotation Tabela
        if (clazz.isAnnotationPresent(Tabela.class)) {

            // Recupera a annotation
            Tabela tabela = clazz.getAnnotation(Tabela.class);

            // Lê o valor da propriedade da annotation
            String nomeTabela = tabela.NomeTabela();

            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("A classe não possui a annotation @Tabela.");
        }
    }
}
