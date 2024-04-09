package matematica;

import java.util.Scanner;

public class ConversionNumerica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar un número binario de 16 dígitos:");
        String numeroBinario = scanner.nextLine();

      
        if (numeroBinario.length() != 16 || !numeroBinario.matches("[01]+")) {
            System.out.println("El número binario ingresado no tiene 16 dígitos.");
        } else {
            
            int decimal = Integer.parseInt(numeroBinario, 2);
            System.out.println("Decimal: " + decimal);
            String octal = Integer.toOctalString(decimal);
            System.out.println("Octal: " + octal);
            String hexadecimal = Integer.toHexString(decimal);
            System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());
        }}}

        
    