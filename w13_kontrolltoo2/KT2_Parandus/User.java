import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        Shop shop1 = new Shop(1, "Euronics Viru", 8, 18, ShopOpen.Workdays);
        Shop shop2 = new Shop(2, "Euronics Ülemiste", 10, 18, ShopOpen.Workdays);
        Shop shop3 = new Shop(3, "Euronics Mustakivi", 12, 22, ShopOpen.Workdays);
        Shop shop4 = new Shop(4, "Euronics Pärnu", 11, 21, ShopOpen.WorkAndFreedays);
        Shop[] shops = {shop1,shop2,shop3,shop4};
        System.out.println("Kas sa tahad mingil kellaajal poodi külastada?(jah/ei)");
        while(!stop) {
            String again = input.nextLine();
            if(again.equals("jah")) {
                System.out.println("Sisesta etteantud aeg, millal sa tahad poodi külastada");
                int userTime = input.nextInt();
                System.out.println("Sisesta millisel päeval, sa tahad poodi külastada(tööpäev(1)/nädalavahetusel(2))");
                int userDay = input.nextInt();
                for(int i = 0; i < shops.length; i++) {
                    System.out.println(shops[i].getShopNumber() + ". " + shops[i].getShopName() + shops[i].checkIfIsOpen(userTime, userDay));
                }
                System.out.println("");
                System.out.println("Millist poodi tahad külastada?");
                int visitShop = input.nextInt();
                for(int i = 0; i < 1; i++) {
                    System.out.println("Euronics Viru poodi on täna külastatud: " + shops[i].shop1(visitShop) + "kord(a)");
                    System.out.println("Euronics ülemiste poodi on täna külastatud: " + shops[i].shop2(visitShop) + "kord(a)");
                    System.out.println("Euronics Mustakivi poodi on täna külastatud: " + shops[i].shop3(visitShop) + "kord(a)");
                    System.out.println("Euronics pärnu poodi on täna külastatud: " + shops[i].shop4(visitShop) + "kord(a)");
                }
                System.out.println("");
                System.out.println("Kas sa tahad veel mingil kellaajal poodi külastada?(jah/ei)");
            } if(again.equals("ei")){
                System.out.println("nägemist!");
                stop = true;
            }
        }
        input.close();
    }
}