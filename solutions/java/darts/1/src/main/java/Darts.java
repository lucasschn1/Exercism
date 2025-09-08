class Darts {
    int score(double xOfDart, double yOfDart) {
        /* TODO: calcular distância até 0.0
        TODO: distância = 1 -> 10 pontos
        TODO: distânica = 5 -> 5 pontos
        TODO: distância = 10 -> 1 ponto
         */

        double distancia = Math.sqrt(Math.pow(xOfDart,2) + Math.pow(yOfDart, 2));

        if (distancia <= 1) {
            return 10;
        } else if (distancia > 1 && distancia <= 5 ) {
            return 5;
        } else if (distancia > 5 && distancia <=10) {
            return 1;
        }
        return 0;
    }
}
