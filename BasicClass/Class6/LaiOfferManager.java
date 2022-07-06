package BasicClass.Class6;

public class LaiOfferManager {
    public String name;
    public int salary;
    public static boolean isRich;
    public static String meetingSoftware;
    public static void ipo() {
        // cannot use this to access isRich in here
        // this usually been used as a Object
        // variable with static means variables belong to class not object
        isRich = true;
    }


    public static void main(String[] agrs){
        LaiOfferManager sunLaoShi = new LaiOfferManager();
        sunLaoShi.name = "Sun";
        sunLaoShi.salary = 9999999;
        LaiOfferManager zhaoLaoShi = new LaiOfferManager();
        zhaoLaoShi.name = " Zhao";
        zhaoLaoShi.salary = 1000000;
    }
}

/*
Each teacher has one's own name and salary.
 */