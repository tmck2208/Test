public class MasterListTester {
    public static void main(String[] args){
        PopcornOrder a = new PopcornOrder("Jalapeno Cheese", 1);
        PopcornOrder b = new PopcornOrder("Butter Microwave", 3);
        PopcornOrder c = new PopcornOrder("Butter Microwave", 2);
        PopcornOrder d = new PopcornOrder("Caramel With Sea Salt", 2);
        PopcornOrder f = new PopcornOrder("Caramel With Sea Salt", 5);
        PopcornOrder g = new PopcornOrder("Kettle Corn", 4);
        MasterList popcorn2023 = new MasterList();
        popcorn2023.addOrder(a);
        popcorn2023.addOrder(b);
        popcorn2023.addOrder(c);
        popcorn2023.addOrder(d);
        popcorn2023.addOrder(f);
        popcorn2023.addOrder(g);
        System.out.println(popcorn2023.getTotalOrders());
        System.out.println(popcorn2023.removeVariety("Butter MicroWave"));
        System.out.println(popcorn2023.removeVariety("Sea Salt Splash"));
        System.out.println(popcorn2023.removeVariety("Kettle Corn"));
        System.out.println(popcorn2023);
        MasterList popcorn2024 = new MasterList();
        System.out.println(popcorn2024.getTotalOrders());
        System.out.println(popcorn2024.removeVariety("Butter MicroWave"));
        System.out.println(popcorn2024.removeVariety("Sea Salt Splash"));
        System.out.println(popcorn2024.removeVariety("Kettle Corn"));
        System.out.println(popcorn2024);
    }
}
