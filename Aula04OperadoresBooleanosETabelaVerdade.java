public class Aula04OperadoresBooleanosETabelaVerdade {

     public static void main(String[] args) {

            // write your code here
            boolean fimDeSemana = true;
            boolean fazendoSol = true;
            boolean vamosAPraia = fimDeSemana && fazendoSol;
            System.out.println(vamosAPraia);

            // Tabela verdade
            // Operador && (AND)
            // true && true = true
            // true && false = false
            // false && true = false
            // false && false = false

            // operador || (OR)
            // true && true = true
            // true && false = true
            // false && true = true
            // false && false = false

            String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
            System.out.println(mensagem);


    }
}
