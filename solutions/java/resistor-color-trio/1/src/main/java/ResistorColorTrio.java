import java.util.List;

class ResistorColorTrio {
    private static final List<String> resistor = List.of("black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white");

    private static final long gigaOhms = 1_000_000_000L;
    private static final long megaOhms = 1_000_000L;
    private static final long kiloOhms = 1_000L;

    String label(String[] colors) {
        if (colors == null || colors.length == 0) {
            throw new IllegalArgumentException("At least one color is required.");
        }

        long resistence = 0;
        for (int i = 0; i < colors.length; i++) {
            int index = resistor.indexOf(colors[i]);

            if (i < 2) {
                resistence = resistence * 10 + index;
            } else if (i == 2) {
                resistence *= (long) Math.pow(10, index);

            }
        }

        return resistence >= gigaOhms ? (resistence / gigaOhms) + " gigaohms"
                : resistence >= megaOhms ? (resistence / megaOhms) + " megaohms"
                : resistence >= kiloOhms ? (resistence / kiloOhms) + " kiloohms"
                : resistence + " ohms";

    }
}
/*
        String response;

        long result;
        if (colors.length >= 3) {
            int indexColor1 = resistor.indexOf(colors[0]);
            int indexColor2 = resistor.indexOf(colors[1]);
            int indexColor3 = resistor.indexOf(colors[2]);

            result = ((indexColor1 * 10L) + indexColor2) * (long) Math.pow(10,indexColor3);

            if (result >= 1_000_000_000) {
                result /= (long) (Math.pow(10,9));
                response = result + " gigaohms";
            } else if (result >= 1_000_000) {
                result /= (long) (Math.pow(10, 6));
                response = result + " megaohms";
            } else if (result >= 1_000) {
                result /= (long) (Math.pow(10,3));
                response = result + " kiloohms";
            } else {
                response = result + " ohms";
            }
        } else if (colors.length == 2) {
            response = resistor.indexOf(colors[0]) * 10 + resistor.indexOf(colors[1]) + " ohms";
        }
        else if (colors.length == 1) {
            response = resistor.indexOf(colors[0]) + " ohms";
        }
        else {
            throw new IllegalArgumentException("There is no item in the list");
        }
        return response;
    }
}
*/

