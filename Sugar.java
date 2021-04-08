class Sugar extends Cookie {
  private String cookieShape;
  private boolean isDecorated;

  Sugar() {
    cookieShape = "";
    isDecorated = false;
  }

  Sugar(String aCookieShape) {
    cookieShape = aCookieShape;
    isDecorated = false;
  }

  String getCookieShape() {
    return cookieShape;
  }

  void setCookieShape(String aCookieShape) {
    cookieShape = aCookieShape;
  }

  void cutCookies(String aCookieShape, int aNumCookies) {
    System.out.println(aNumCookies + " cookies were cut into " + aCookieShape);
    super.setNumCookies(aNumCookies);
  }

  void decorateCookies(){
    if(super.getIsBaked() == true) {
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");

    }
  }
}