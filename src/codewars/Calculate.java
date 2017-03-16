package codewars;

public class Calculate {

    private int  digitThis(int someNumbers){

        int newOne;

        do {
            newOne = someNumbers % 10;
            someNumbers = newOne / 10;
            System.out.println(newOne);
        } while (someNumbers > 0);



        return 0;

    }



    public static void main(String[] args) {



        Calculate c = new Calculate();

        int vasya = c.digitThis(4119);

        System.out.println(vasya);
    }

}
