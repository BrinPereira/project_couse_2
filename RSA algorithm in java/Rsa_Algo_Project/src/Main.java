import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.*;

public class Main
{
   private final static BigInteger one      = new BigInteger("1");
   private final static SecureRandom random = new SecureRandom();

   private BigInteger privateKey;
   private BigInteger publicKey;
   private BigInteger modulus;

   Main(int N)
   {
      BigInteger p = BigInteger.probablePrime(N/2, random);
      BigInteger q = BigInteger.probablePrime(N/2, random);
      BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));

      modulus    = p.multiply(q);
      publicKey  = new BigInteger("65537");     
      privateKey = publicKey.modInverse(phi);
   }
BigInteger encrypt(BigInteger message)
{
      return message.modPow(publicKey, modulus);
   }

   BigInteger decrypt(BigInteger encrypted) 
   {
      return encrypted.modPow(privateKey, modulus);
   }

   public String toString() {
      String s = "";
      s += "public  = " + publicKey  + "\n";
      s += "private = " + privateKey + "\n";
      s += "modulus = " + modulus;
      return s;
   }

   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of N");
     int N = sc.nextInt();
     Main key = new Main(N);
      System.out.println(key);
      System.out.println("enter the message in numbers");
      
      BigInteger message=sc.nextBigInteger();
      BigInteger encrypt = key.encrypt(message);
      BigInteger decrypt = key.decrypt(encrypt);
      System.out.println("message   = " + message);
      System.out.println("encrpyted = " + encrypt);
      System.out.println("decrypted = " + decrypt);
   }
}
