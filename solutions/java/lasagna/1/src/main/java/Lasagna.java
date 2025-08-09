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
        return (layersLasagna * 2) + minutesInOven;
    }
}
class Main {
    public static void main(String[] args) {
        Lasagna myLasagna = new Lasagna();
        System.out.println("Expected Minutes In Oven: " + Lasagna.expectedMinutesInOven());
        System.out.println("Remaining Minutes in Oves: " + myLasagna.remainingMinutesInOven(10));
        System.out.println("Preparation Time: " + myLasagna.preparationTimeInMinutes(3));
        System.out.println("Total Time in Minutes: " + myLasagna.totalTimeInMinutes(3,20));
    }
}


