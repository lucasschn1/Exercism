public class Say {

    private static final String[] UNIDADES = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine"
    };

    private static final String[] ESPECIAIS = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] DEZENAS = {
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    String[] ESCALAS = {
            "", "thousand", "million", "billion"
    };

    public String say(long number) {
        // Validação dos limites (faz os dois últimos testes passarem)
        if (number < 0 || number >= 1_000_000_000_000L) {
            throw new IllegalArgumentException("Número fora do limite");
        }

        if (number == 0) {
            return "zero";
        }

        String resultadoFinal = "";
        int indexEscala = 0;

        while (number > 0) {
            long bloco = number % 1000;

            if (bloco > 0) {
                String textoDoBloco = traduzirBlocoDeTres(bloco);
                String escala = ESCALAS[indexEscala];

                // Adiciona a escala (thousand, million) apenas se ela não for vazia
                if (!escala.isEmpty()) {
                    textoDoBloco = textoDoBloco + " " + escala;
                }

                // Junta o texto atual com o resultado final, administrando o espaço no meio
                if (resultadoFinal.isEmpty()) {
                    resultadoFinal = textoDoBloco;
                } else {
                    resultadoFinal = textoDoBloco + " " + resultadoFinal;
                }
            }

            number = number / 1000;
            indexEscala++;
        }
        return resultadoFinal;
    }

    public String traduzirBlocoDeTres(long bloco) {
        StringBuilder texto = new StringBuilder();

        int centena = (int) (bloco / 100);
        int resto = (int) (bloco % 100);

        // 1. Resolve a casa das centenas
        if (centena > 0) {
            texto.append(UNIDADES[centena]).append(" hundred");
        }

        // 2. Resolve o que sobrou (dezenas e unidades)
        if (resto > 0) {
            if (centena > 0) {
                texto.append(" ");
            }

            if (resto < 10) {
                // Entre 1 e 9: busca direto nas unidades
                texto.append(UNIDADES[resto]);

            } else if (resto < 20) {
                // Entre 10 e 19: busca nos especiais
                // Como o array começa no índice 0 (ten), subtraímos 10 do resto
                texto.append(ESPECIAIS[resto - 10]);

            } else {
                // 20 ou mais: divide em dezena e unidade
                int dezena = resto / 10;
                int unidade = resto % 10;

                texto.append(DEZENAS[dezena]);

                // Detalhe importante do inglês: o hífen para dezenas compostas
                if (unidade > 0) {
                    texto.append("-").append(UNIDADES[unidade]);
                }
            }
        }

        return texto.toString();
    }
}
