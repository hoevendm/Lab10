class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar("tree");
    tree.cutCookies("tree", 10);
    tree.bakeCookies(350, 12);
    tree.decorateCookies();
    Sugar aCookie = new Sugar();
    aCookie.decorateCookies();
  }
}