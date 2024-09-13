package boletimMatrizes;

public class BoletimAlunosMatrizes {

	 public static void main(String[] args) {
	       
	        double[][] notas = {
	            {9.9, 8.0, 6.4, 9.9},
	            {7.3, 8.8, 9.3, 9.8},
	            {6.3, 8.2, 7.7, 7.1},
	            {7.6, 9.9, 8.6, 9.7},
	            {6.8, 7.2, 6.2, 7.2}
	        };
	        
	        
	        String[] disciplinas = {"| Matemática", "| Física", "| Química", "| Biologia", "| História"};
	        
	       
	        double media;
	        boolean passouDeAno = true;
	        
	        for (int i = 0; i < disciplinas.length; i++) {
	            media = calcularMedia(notas[i]);
	            System.out.println("-------------------------------");
	            String status = media >= 6.0 ? "APROVADO |" : "REPROVADO |";
	            System.out.printf("%s: \t%.1f - %s%n", disciplinas[i], media, status);
	            if (status.equals("REPROVADO")) {
	                passouDeAno = false;
	            }
	        }
	        
	        
	        String statusFinal = passouDeAno ? "APROVADO" : "REPROVADO";
	        System.out.println("-------------------------------\n");
	        System.out.printf("Status Final – %s%n", statusFinal);
	    }
	    
	    
	    public static double calcularMedia(double[] notas) {
	        double soma = 0.0;
	        for (double nota : notas) {
	            soma += nota;
	        }
	        return soma / notas.length;
	    }
}
