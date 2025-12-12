import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

class ProteinTranslator {
    HashMap<String, String> listaAminoacidos = new HashMap<>();

    // -> Construtor da classe
    ProteinTranslator() {
        // inserindo valores no map
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

    List<String> translate(String rnaSequence) {

        List<String> traducao = new ArrayList<>();

        // Verificar se é menor que 3
        if (rnaSequence.length() > 3) {
            throw new IllegalArgumentException("Invalid codon");
        }

        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String resultadoCodon = rnaSequence.substring(i, i + 3);

            // buscando aminoacido no map
            String aminoacido = listaAminoacidos.get(resultadoCodon);

            if (aminoacido != null && !aminoacido.equals("STOP")) {
                traducao.add(aminoacido);
            } else if (Objects.equals(aminoacido, "STOP")){
                break;
            } else {
                throw new IllegalArgumentException("Invalid codon");
            }
        }
        return traducao;
    }
}