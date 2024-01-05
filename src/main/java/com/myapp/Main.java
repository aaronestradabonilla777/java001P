package com.myapp;
import java.util.stream.Collectors;
// Invertir cadena de texto
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Ingresa una cadena de texto:");
//         String input = scanner.nextLine();
//         String reversed = new StringBuilder(input).reverse().toString();
//         System.out.println("Cadena invertida: " + reversed);
//     }
// }

//metodo 2
public class Main {
    public static void main(String[] args) {
        String str = "Hola Mundo";
        String reversed = new StringBuilder(str.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.toList()))
            .reverse()
            .toString();
        System.out.println(reversed);
    }
}
//3metodo
// string text = "Hola Mundo";
// string textResult = "";

// char[] chars = text.ToCharArray();
// Array.Reverse(chars);
// textResult = new string(chars);

// console.WriteLine(textResult);