package repeticao;

public class string {
    public static void main(String[] args) {

        String nome = "João ";
        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome;
        String[] vect = nomeCompleto.split(" ");

        System.out.println(nomeCompleto);
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.charAt(0));
        System.out.println(nome.substring(1, 3));
        System.out.println(nome.equals(sobrenome));
        System.out.println(nome.equalsIgnoreCase("joão"));
        System.out.println("Trim:" + nome.trim());
        System.out.println("Replace:" + nome.replace('ã', 'B'));
        System.out.println("Split: " + vect[0] + " " + vect[2] ); //Usado vect[2] pois temos um espaço a mais no nome João

    }

}
