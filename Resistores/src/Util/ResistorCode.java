package Util;

import java.util.HashMap;
import java.util.Map;

public class ResistorCode {

    private static final Map<Character, String> cores = new HashMap<>();

    static {
        cores.put('0', "preto");
        cores.put('1', "marrom");
        cores.put('2', "vermelho");
        cores.put('3', "laranja");
        cores.put('4', "amarelo");
        cores.put('5', "verde");
        cores.put('6', "azul");
        cores.put('7', "violeta");
        cores.put('8', "cinza");
        cores.put('9', "branco");
    }

    public static String getCorResistor(String entrada) {
        char[] digitos = getChars(entrada);
        StringBuilder resultado = new StringBuilder();

        //primeira e a segunda banda correspondem ao primeiro e segundo dígito do valor de ohms
        resultado.append(cores.get(digitos[0]));
        resultado.append(" ");
        resultado.append(cores.get(digitos[1]));

        //terceira banda indica a potência de 10 que deve ser multiplicada para obter o valor, caso apenas 2 dígitos, completa com 'preto'.
        if (digitos.length > 2) {
            resultado.append(" ");
            resultado.append(cores.get(String.valueOf(digitos.length - 2).charAt(0)));
        } else {
            resultado.append(" preto");
        }

        resultado.append(" dourado");
        return resultado.toString();
    }

    private static char[] getChars(String entrada) {
        String[] parte = entrada.split(" ");
        String valor = parte[0].replace("k", "").replace("M", "");
        String unidade = parte[0].contains("k") ? "k" : (parte[0].contains("M") ? "M" : "");
        int multiplier = 0;

        if (unidade.equals("k")) {  multiplier = 1; } else if (unidade.equals("M")) { multiplier = 2; }

        double valorResistor = Double.parseDouble(valor);
        //se k, 10 elevado a 3 = 1.000 - se m, 10 elevado a 6 = 1.000.000
        valorResistor = valorResistor * Math.pow(10, multiplier * 3);

        int valorArredondado = (int) valorResistor;

        return String.valueOf(valorArredondado).toCharArray();
    }
}
