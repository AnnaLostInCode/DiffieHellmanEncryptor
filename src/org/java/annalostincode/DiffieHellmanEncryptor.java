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
        BigInteger k1appliedPrivateKey = k1.compute(base, modulo);
        BigInteger k2appliedPrivateKey = k2.compute(base, modulo);
        return Objects.equals(k1.compute(k2appliedPrivateKey, modulo), k2.compute(k1appliedPrivateKey, modulo));
    }

}
