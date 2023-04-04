package org.java.annalostincode;

import java.math.BigInteger;
import java.util.Objects;

public class DiffieHellmanEncryptor {
    private final BigInteger privateKey;

    public DiffieHellmanEncryptor(BigInteger privateKey) {
        this.privateKey = privateKey;
    }

    public BigInteger compute(BigInteger base, BigInteger modulo) {
        return base.modPow(privateKey, modulo);
    }

    public static boolean setSecret(DiffieHellmanEncryptor k1, DiffieHellmanEncryptor k2, BigInteger modulo, BigInteger base) {
        BigInteger k1mix = k1.compute(base, modulo);
        BigInteger k2mix = k2.compute(base, modulo);

        BigInteger k1secret = k1.compute(k2mix, modulo);
        System.out.println("Secret 1: " + k1secret);
        BigInteger k2secret = k2.compute(k1mix, modulo);
        System.out.println("Secret 2: " + k2secret);

        return Objects.equals(k1secret, k2secret);
    }

}
