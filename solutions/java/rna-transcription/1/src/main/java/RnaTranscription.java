class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();

        for (char i : (dnaStrand.toUpperCase()).toCharArray()) {
            switch (i) {
                case 'A' -> rna.append('U');
                case 'T' -> rna.append('A');
                case 'C' -> rna.append('G');
                case 'G' -> rna.append('C');
            }
        }
        return rna.toString();
    }
}
