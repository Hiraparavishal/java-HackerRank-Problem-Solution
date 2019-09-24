import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

       MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashInBytes = md.digest(s.getBytes(StandardCharsets.UTF_8));

     
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        System.out.println(sb.toString());
    }
}

