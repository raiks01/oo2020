public class Mall {

    ShopName shopName;
    int openTime;
    int closeTime;
    int userTime;
    static int visitsSportland = 0;
    static int visitsRimi = 0;
    static int visitsEuronics = 0;

    public void Sportland() {
        shopName = ShopName.Sportland;
        openTime = 7;
        closeTime = 12;
    }

    public void Rimi() {
        shopName = ShopName.Rimi;
        openTime = 13;
        closeTime = 16;
    }

    public void Euronics() {
        shopName = ShopName.Euronics;
        openTime = 16;
        closeTime = 22;
    }

    public static String Test(int openTime, int userTime, int closeTime) {
        if (7 <= userTime && userTime <= 12) {
            visitsSportland++;
            return ShopName.Sportland + " on lahti ja seda poodi oled külastatud: " + visitsSportland + " kord(a).";
        } else if (13 <= userTime && userTime <= 16){
            visitsRimi++;
            return  ShopName.Rimi + " on lahti ja seda poodi oled külastatud: " + visitsRimi + " kord(a).";
        }  else if (17 <= userTime && userTime <= 22){
            visitsEuronics++;
            return ShopName.Euronics + " on lahti ja seda poodi oled külastatud: " + visitsEuronics + " kord(a).";
        }  else {
            return "Ühtegi poodi ei ole lahti";
        }
    }

}