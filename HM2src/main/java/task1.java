public class task1 {


    public static void main(String[] args) {


        System.out.println(checkSumm(10, 20));
        System.out.println(task3(8));
        Writeline("привет",5);
        System.out.println(task5(2021));



    }

    public static boolean checkSumm(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;

        }


    }







    public static void pozitive(int a){

         if (a < 0){
             System.out.println("число отрицательное");

         }else {
             System.out.println("число положительное");
         }

    }

    public static boolean task3(int a){
        if (a < 0){
            return true;
        }
        else{
            return false;
        }


    }

    public static void Writeline(String s,int a){

        for (int i=0;i<a; i++){
            System.out.println(s);


        }


    }

    public static boolean task5(int a){
        if (a%400 == 0) {
            return true;
        }else if(a%100==0){
            return false;
        }else if (a%4==0){
            return true;
        }else {
            return false;


        }




    }







}







