package org.java.annalostincode;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.diffieHellmanKeyExchange();
    }

    private void diffieHellmanKeyExchange() {
        DiffieHellmanKeyExchange alice = new DiffieHellmanKeyExchange(BigInteger.valueOf(4));
        DiffieHellmanKeyExchange bob = new DiffieHellmanKeyExchange(BigInteger.valueOf(3));

        BigInteger modulo = BigInteger.valueOf(23);
        BigInteger base = BigInteger.valueOf(5);

        DiffieHellmanKeyExchange.setSecret(alice, bob, modulo, base);
    }

}