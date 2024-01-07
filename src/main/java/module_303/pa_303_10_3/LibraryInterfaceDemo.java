package pa_303_10_3;

public class LibraryInterfaceDemo {

    // TODO: the KidUser accounts should be automatically updated daily and upgraded to Adult accounts when the age increases.
    // I do not understand why Adults cannot take out Kids books.
    public static void main(String[] args) {

        KidUser kid1 = new KidUser(10);
        kid1.registerAccount();  // success
        kid1.requestBook("Kids");// success


        KidUser kid2 = new KidUser(18);
        kid2.registerAccount();  // fail
        kid2.requestBook("Fiction"); // fail


        AdultUser adult1 = new AdultUser(5);
        adult1.registerAccount();  // fail
        adult1.requestBook("Kids");  // fail


        AdultUser adult2 = new AdultUser(23);
        adult2.registerAccount();  // success
        adult2.requestBook("Fiction");  // success
    }

}
