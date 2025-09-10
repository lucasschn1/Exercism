import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        return BigInteger.valueOf(2).pow(square-1);
    }

    BigInteger grainsOnBoard() {
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    }

}
