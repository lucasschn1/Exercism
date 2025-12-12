import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

class ProteinTranslator {

    // Variável de instância (o dicionário Códon -> Aminoácido)
    HashMap<String, String> listaAminoacidos = new HashMap<>();

    // Construtor: Popula o dicionário na criação do objeto
    public ProteinTranslator() {
        listaAminoacidos.put("AUG", "Methionine");
        listaAminoacidos.put("UUU", "Phenylalanine");
        listaAminoacidos.put("UUC", "Phenylalanine");
        listaAminoacidos.put("UUA", "Leucine");
        listaAminoacidos.put("UUG", "Leucine");
        listaAminoacidos.put("UCU", "Serine");
        listaAminoacidos.put("UCC", "Serine");
        listaAminoacidos.put("UCA", "Serine");
        listaAminoacidos.put("UCG", "Serine");
        listaAminoacidos.put("UAU", "Tyrosine");
        listaAminoacidos.put("UAC", "Tyrosine");
        listaAminoacidos.put("UGU", "Cysteine");
        listaAminoacidos.put("UGC", "Cysteine");
        listaAminoacidos.put("UGG", "Tryptophan");
        listaAminoacidos.put("UAA", "STOP");
        listaAminoacidos.put("UAG", "STOP");
        listaAminoacidos.put("UGA", "STOP");
    }

    public List<String> translate(String rnaSequence) {

        List<String> traducao = new ArrayList<>();
        int codonStart;

        // FLAG: Usada para saber se o loop parou por um motivo válido (STOP)
        boolean stopEncontrado = false;

        // Loop: Itera sobre códons de 3 bases, garantindo que não ultrapasse o limite
        // (codonStart deve ser declarado fora do loop para ser usado no escopo abaixo)

        for (codonStart = 0; codonStart <= rnaSequence.length() - 3; codonStart += 3) {

            String resultadoCodon = rnaSequence.substring(codonStart, codonStart + 3);

            // Busca no mapa
            String aminoacido = listaAminoacidos.get(resultadoCodon);

            // 1. Caso: Códon Inválido/Desconhecido (aminoacido é null)
            if (aminoacido == null) {
                throw new IllegalArgumentException("Invalid codon");
            }

            // 2. Caso: STOP
            if (aminoacido.equals("STOP")) {
                stopEncontrado = true; // Define a flag
                break;                 // Para a tradução
            }

            // 3. Caso: Aminoácido Válido
            traducao.add(aminoacido);
        }

        // VERIFICAÇÃO FINAL: Se o loop parou, precisamos saber POR QUE
        // A exceção é lançada APENAS se:
        // 1. Sobrou material (codonStart < rnaSequence.length()) E
        // 2. Não houve um STOP que justificasse a parada (!stopEncontrado)
        if (codonStart < rnaSequence.length() && !stopEncontrado) {
            throw new IllegalArgumentException("Invalid codon");
        }

        return traducao;
    }
}