import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
// see https://github.com/JustRevDice/whosjoe-joerepo
public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    int[] primes = {3, 5, 7, 11, 13, 17, 19, 23, 607}
    for (int i : primes)
      assertEquals("Test by Primes for Primes", true, PrimeCheck.isPrime(i);
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    for (int i = 2; i < 50; i*=(i+1))
      assertEquals("Test by non-Primes against Primes (don't worry about it)", false, PrimeCheck.isPrime(i));
    }
}
