public class Main {


    public static void main(String[] args) {

        //экономика не прописана, но название монеты подразумевает целочисленные значения
        int palto = 70;
        int shlypa = 25;
        int costum = 53;
        int sorochka = 19;
        int tufli = 41;

        int paltoDis = 77;
        int shlypaDis = 37;
        int costumDis = 44;
        int sorochkaDis = 0;
        int tufliDis = 32;

        int cash = 312;

        int need = getCurrentPrice(palto, paltoDis)
                + getCurrentPrice(shlypa, shlypaDis)
                + getCurrentPrice(costum, costumDis)
                + getCurrentPrice(sorochka, sorochkaDis)
                + getCurrentPrice(tufli, tufliDis);

        if (cash>=need) {
            System.out.println("На покупку хватает (монеты:"+cash+", стоимость: "+need+")");
        } else {
            System.out.println("Надо подкопить "+(need-cash));
        }



    }

    public static int getCurrentPrice (int price, int discount) {
        return (int) ((float)price * (100-discount)/100);
    }
}
