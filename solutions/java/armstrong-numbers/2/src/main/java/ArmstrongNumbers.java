class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int originalNumber = numberToCheck;

        // TODO : verificar quantos digitos tem -> INT
                // Dividir número por 10 até 0 -> n° de digitos
        int numDigits = 0;
        int temp = numberToCheck;
        if (temp == 0) {
            numDigits = 1;
        }
        while (temp > 0) {
            temp /= 10;
            numDigits++;
        }
        // TODO: separar cada algorismo -> INT
                // Criar um array para os digitos e usar módulo para pegar cada um separadamente
        int[] digitosSeparados = new int[numDigits];
        int temp2 = numberToCheck;

        for (int i = numDigits - 1; i >= 0; i--) {
            digitosSeparados[i] = temp2 % 10;
            temp2 /= 10;
        }

        // TODO : elever cada algarismo pelo quantidade de digitos -> INT
        int soma = 0;
        for (int num : digitosSeparados) {
            soma += (int) Math.pow(num, numDigits);
        }

        // TODO : somar e verificar se é igual ao número orginal -> INT
        return soma == originalNumber;


    }

}
