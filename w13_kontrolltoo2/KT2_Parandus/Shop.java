public class Shop {
    private String shopName;
    private int openTime;
    private int closeTime;
    private int visit = 0;
    private int visitM = 0;
    private int visitÜ = 0;
    private int visitV = 0;
    private int visitP = 0;
    private ShopOpen shopOpen;
    private String userDay;
    private int shopNumber;

    public Shop(int shopNumber, String shopName, int openTime, int closeTime, ShopOpen shopOpen) {
        this.shopNumber = shopNumber;
        this.shopName = shopName;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.shopOpen = shopOpen;
    }

    public int getShopNumber() {
        return shopNumber;
    }

    public String checkIfIsOpen(int userTime, int userDay){
        if (userTime >= openTime && userTime <= closeTime) {
            if(userDay == 1) {
                return " on lahti!";
            } else if(userDay == 2 && shopOpen == ShopOpen.WorkAndFreedays){
                return " on lahti!";
            } else {
                return " on kinni!";
            }
        } else {
            return " on kinni!";
        }
    }

    public int shop1(int visitShop) {
        if(visitShop == 1) {
            visitV++;
        }
        return visitV;
    }

    public int shop2(int visitShop) {
        if(visitShop == 2) {
            visitÜ++;
        }
        return visitÜ;
    }

    public int shop3(int visitShop) {
        if(visitShop == 3) {
            visitM++;
        }
        return visitM;
    }

    public int shop4(int visitShop) {
        if(visitShop == 4) {
            visitP++;
        }
        return visitP;
    }

    public String getShopName() {
        return shopName;
    }

    /*public int getShopVisits() {
        return visit;
    }*/
}