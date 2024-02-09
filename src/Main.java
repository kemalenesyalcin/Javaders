public class Main {
    public static void  main(String[] args) {
        for (int x=1; x<=50; x++){
            if(x%3 == 0){  //Sayı 3'ün katı ise
                System.out.println(x+"3'ün katıdırrrr");
            }
            if(x%5 == 0){  //Sayı 5'in katı ise
                System.out.println(x+"5'in katıdır");
            }
            if(x%7 == 0){  //Sayı 7'nin katı ise
                System.out.println(x+"7'nin katıdır");
            }
        }
    }
}