public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minInOven) {
        return expectedMinutesInOven() - minInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layersLasagna) {
        return layersLasagna * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layersLasagna, int minutesInOven) {
        return preparationTimeInMinutes(layersLasagna) + minutesInOven;
    }
}



