package org.java.annalostincode;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.diffieHellmanKeyExchange();
    }

    private void diffieHellmanKeyExchange() {
        DiffieHellmanEncryptor alice = new DiffieHellmanEncryptor(BigInteger.valueOf(4));
        DiffieHellmanEncryptor bob = new DiffieHellmanEncryptor(BigInteger.valueOf(3));

        BigInteger modulo = BigInteger.valueOf(23);
        BigInteger base = BigInteger.valueOf(5);

        DiffieHellmanEncryptor.setSecret(alice, bob, modulo, base);
    }

}