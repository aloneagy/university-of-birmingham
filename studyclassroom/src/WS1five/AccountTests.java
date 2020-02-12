package WS1five;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTests {

  private MusicTitle MT1, MT2, MT3;
  private AccountStandard AA;
  private AccountAdministrator BB;

  @BeforeEach
  public void init() {
    MT1 = new MusicTitle("A1", "A2", 3);
    MT2 = new MusicTitle("B1", "B2", 3);
    MT3 = new MusicTitle("C1", "C2", 4);

    ArrayList<MusicTitleInterface> testList = new ArrayList<>();
    testList.add(MT1);
    testList.add(MT2);
    testList.add(MT1);

    Account testCustomer = new AccountStandard("D1", "D2", "D3", "D4");

    AA = new AccountStandard("D1", "D2", "D2", "D4");
    BB = new AccountAdministrator("E1", "E2", "E3", "E4");
  }

  // testing musicTitle1's getTitle()
  @Test
  public void test1() {
    String expectedTitle = "A1";
    String actualTitle = MT1.getTitle();
    assertEquals(expectedTitle, actualTitle, "title should be: " + expectedTitle);
  }

  // testing musicTitle1's getArtist()
  @Test
  public void test2() {
    String expectedArtist = "A2";
    String actualArtist = MT1.getArtist();
    assertEquals(expectedArtist, actualArtist, "artist should be: " + expectedArtist);
  }

  // testing musicTitle1's getPrice()
  @Test
  public void test3() {
    int expectedPrice = 3;
    int actualPrice = MT1.getPrice();
    assertEquals(expectedPrice, actualPrice, "artist should be: " + expectedPrice);
  }

  // testing customerJohn's getName()
  @Test
  public void test4() {
    String expectedName = "D1";
    String actualName = AA.getName();
    assertEquals(expectedName, actualName, "name should be: " + expectedName);
  }

  // testing customerJohn's getSalutation()
  @Test
  public void test5() {
    String expectedSalutation = "D2";
    String actualSalutation = AA.getSalutation();
    assertEquals(expectedSalutation, actualSalutation,
        "salutation should be: " + expectedSalutation);
  }

  // testing customerJohn's getEmail()
  @Test
  public void test6() {
    String expectedEmail = "D2";
    String actualEmail = AA.getEmail();
    assertEquals(expectedEmail, actualEmail, "email should be: " + expectedEmail);
  }

  // testing customerJohn's getBalance()
  @Test
  public void test7() {
    int expectedBalance = 0;
    int actualBalance = AA.getBalance();
    assertEquals(expectedBalance, actualBalance, "balance should be: " + expectedBalance);
  }

  // testing customerJohn's getTitlesBought()
  @Test
  public void test8() {
    ArrayList<MusicTitle> expectedPurchaseList = new ArrayList<>();
    ArrayList<MusicTitle> actualPurchaseList = AA.getTitlesBought();
    for (int i = 0; i < actualPurchaseList.size(); i++) {
      assertEquals(expectedPurchaseList.get(i), actualPurchaseList.get(i));
    }
  }

  // testing customerJohn's getFailedLoginAttempts()
  // @Test
  // public void test9() {
  // int expectedFailedLoginAttempts = 0;
  // int actualFailedLoginAttempts = 0;
  // assertEquals(expectedFailedLoginAttempts, actualFailedLoginAttempts,
  // "failed login attempts should be: " + expectedFailedLoginAttempts);
  // }

  // testing MAXIMAL_LOGIN_ATTEMPTS
  @Test
  public void test10() {
    int expectedMaximalLoginAttempts = 3;
    int actualMaximalLoginAttempts = AccountStandard.MAXIMAL_LOGIN_ATTEMPTS;
    assertEquals(expectedMaximalLoginAttempts, actualMaximalLoginAttempts,
        "failed login attempts should be: " + expectedMaximalLoginAttempts);
  }

  // testing MAXIMAL_LOGIN_ATTEMPTS
  @Test
  public void test11() {
    int expectedMaximalLoginAttempts = 3;
    int actualMaximalLoginAttempts = AccountStandard.MAXIMAL_LOGIN_ATTEMPTS;
    assertEquals(expectedMaximalLoginAttempts, actualMaximalLoginAttempts,
        "failed login attempts should be: " + expectedMaximalLoginAttempts);
  }

  // customerJohn logs in successfully and tries to make a purchase, which
  // fails due to insufficient funds
  @Test
  public void test12() {
    AA.login("D4");
    assertTrue(AA.getLoggedIn());

    AA.buy(MT1);
    ArrayList<MusicTitle> actualPurchaseList = AA.getTitlesBought();
    assertTrue(actualPurchaseList.isEmpty());
  }

  // customerJohn logs in unsuccessfully
  @Test
  public void test13() {
    AA.login("999");
    assertFalse(AA.getLoggedIn());

    assertEquals(1, AA.getFailedLoginAttempts());

    AA.buy(MT1);
    ArrayList<MusicTitle> actualPurchaseList = AA.getTitlesBought();
    assertTrue(actualPurchaseList.isEmpty());
  }

  // customerJohn tries to log in twice unsuccessfully
  @Test
  public void test14() {
    AA.login("cwww");
    assertFalse(AA.getLoggedIn());

    assertEquals(1, AA.getFailedLoginAttempts());

    AA.login("cssd");
    assertFalse(AA.getLoggedIn());

    assertEquals(2, AA.getFailedLoginAttempts());

    AA.buy(MT1);
    ArrayList<MusicTitle> actualPurchaseList = AA.getTitlesBought();
    assertTrue(actualPurchaseList.isEmpty());
  }

  // customerJohn completes a purchase successfully
  @Test
  public void test15() {
    AA.login("99");
    assertFalse(AA.getLoggedIn());

    assertEquals(1, AA.getFailedLoginAttempts());

    AA.login("00");
    assertFalse(AA.getLoggedIn());

    assertEquals(2, AA.getFailedLoginAttempts());

    AA.login("D4");
    assertTrue(AA.getLoggedIn());

    assertEquals(0, AA.getFailedLoginAttempts());

    AA.deposit(20);
    AA.buy(MT1);

    String expectedMusicTitle = "A1";
    String actualMusicTitle = AA.getTitlesBought().get(0).getTitle();
    assertEquals(expectedMusicTitle, actualMusicTitle);

    String expectedArtist = "A2";
    String actualArtist = AA.getTitlesBought().get(0).getArtist();
    assertEquals(expectedArtist, actualArtist);

    int expectedPrice = 3;
    int actualPrice = AA.getTitlesBought().get(0).getPrice();
    assertEquals(expectedPrice, actualPrice);

    int expectedBalance = 17;
    int actualBalance = AA.getBalance();
    assertEquals(expectedBalance, actualBalance);

    AA.logout();
    assertFalse(AA.getLoggedIn());

    AA.deposit(20);
    expectedBalance = 37;
    actualBalance = AA.getBalance();
    assertEquals(expectedBalance, actualBalance);

    AA.buy(MT2);
    int expectedPurchaseListSize = 1; // still 1
    int actualPurchaseListSize = AA.getTitlesBought().size();

    assertEquals(expectedPurchaseListSize, actualPurchaseListSize);
  }

  // customerJohn enters wrong password three times, admin tries to reset the
  // password without logging in
  @Test
  public void test16() {
    AA.login("qwe");
    assertFalse(AA.getLoggedIn());

    assertEquals(1, AA.getFailedLoginAttempts());

    AA.login("cirarn");
    assertFalse(AA.getLoggedIn());

    assertEquals(2, AA.getFailedLoginAttempts());

    AA.login("vasd");
    assertFalse(AA.getLoggedIn());

    assertEquals(3, AA.getFailedLoginAttempts());

    BB.resetAccount(AA, "D");
    String expectedPassword = "D4";
    assertTrue(AA.checkPassword(expectedPassword));

    int expectedFailedLoginAttempts = 3;
    int actualFailLoginAttempts = AA.getFailedLoginAttempts();
    assertEquals(expectedFailedLoginAttempts, actualFailLoginAttempts);
  }

  // customerJohn enters wrong password three times, admin manages to log in successfully, and
  // resets customer John' account successfully.
  @Test
  public void test17() {
    AA.login("casdrn");
    assertFalse(AA.getLoggedIn());

    assertEquals(1, AA.getFailedLoginAttempts());

    AA.login("asdvn");
    assertFalse(AA.getLoggedIn());

    assertEquals(2, AA.getFailedLoginAttempts());

    AA.login("c123as");
    assertFalse(AA.getLoggedIn());

    assertEquals(3, AA.getFailedLoginAttempts());

    BB.login("111");
    assertFalse(BB.getLoggedIn());

    BB.login("E4");
    assertTrue(BB.getLoggedIn());

    BB.addAccount(AA);
    String expectedAccountName = "D1";
    String actualAccountName = BB.getAccounts().get(0).getName();
    assertEquals(expectedAccountName, actualAccountName);
    assertTrue(!BB.getAccounts().isEmpty());

    BB.resetAccount(AA, "T8");
    System.out.println(BB);
    String expectedPassword = "T8";
    assertTrue(AA.checkPassword(expectedPassword));

    int expectedFailedLoginAttempts = 0;
    int actualFailLoginAttempts = AA.getFailedLoginAttempts();
    assertEquals(expectedFailedLoginAttempts, actualFailLoginAttempts);

    AA.login("T8");
    // assertTrue(customerJohn.getLoggedIn());

    AA.deposit(100);
    AA.buy(MT1);
    AA.buy(MT2);
    AA.buy(MT3);

    int expectedPurchaseListSize = 3;
    int actualPurchaseListSize = AA.getTitlesBought().size();
    assertEquals(expectedPurchaseListSize, actualPurchaseListSize);

    String expectedTitle = "C1";
    String expectedArtist = "C2";
    int expectedPrice = 4;

    String actualTitle = AA.getTitlesBought().get(2).getTitle();
    String actualArtist = AA.getTitlesBought().get(2).getArtist();
    int actualPrice = AA.getTitlesBought().get(2).getPrice();
    assertEquals(expectedTitle, actualTitle);
    assertEquals(expectedArtist, actualArtist);
    assertEquals(expectedPrice, actualPrice);

    int expectedBalance = 90;
    int actualBalance = AA.getBalance();
    assertEquals(expectedBalance, actualBalance);
  }

  // admin resets deputy's account successfully
  @Test
  public void test18() {
    Account deputy = new AccountAdministrator("R1", "R2", "R3", "R4");
    deputy.login("d123124");
    assertFalse(deputy.getLoggedIn());

    deputy.login("fas3");
    assertFalse(deputy.getLoggedIn());

    deputy.login("vsda");
    assertFalse(deputy.getLoggedIn());

    BB.login("E4");
    assertTrue(BB.getLoggedIn());

    BB.addAccount(deputy);
    BB.resetAccount(deputy, "d1");

    String expectedPassword = "d1";
    String actualPassword = BB.getAccounts().get(0).getPassword();
    assertEquals(expectedPassword, actualPassword);

    assertFalse(deputy.getLoggedIn());
    deputy.login("d1");
    assertFalse(!deputy.getLoggedIn());

    deputy.changePassword("R4", "d1");
    deputy.logout();
    assertFalse(deputy.getLoggedIn());

    deputy.login("d1");
    assertTrue(deputy.getLoggedIn());
  }


}
