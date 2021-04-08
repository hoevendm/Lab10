class Cookie {
  private int numCookies;
  private int cookieBakeTemp;
  private int cookieBakeMins;
  private boolean isBaked;

  Cookie() {
    numCookies = 0;
    cookieBakeTemp = 0;
    cookieBakeMins = 0;
    isBaked = false;
  }

  Cookie(int aNumCookies, int aCookieBakeTemp, int aCookieBakeMins) {
    numCookies = aNumCookies;
    cookieBakeTemp = aCookieBakeTemp;
    cookieBakeMins = aCookieBakeMins;
    isBaked = false;
  }

  boolean getIsBaked() {
    return isBaked;
  }

  void setNumCookies(int aNumCookies) {
    numCookies = aNumCookies;
  }

  void bakeCookies (int aCookieBakeTemp, int aCookieBakeMins) {
    System.out.println("The cookies were baked at " + aCookieBakeTemp + " degrees F for " + aCookieBakeMins + " minutes");
    isBaked = true;
  }
}