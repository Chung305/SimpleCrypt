package src;

import org.junit.Test;

public class SonnetCryptTest {
    @Test
    public void CryptTest(){
        ROT13 cipher = new ROT13('a', 'n');

        System.out.println(cipher.crypt(SonnetCrypt.sonnetReader()));
    }
}
