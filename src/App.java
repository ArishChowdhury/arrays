public class App {
    public static void main(String[] args){

        //Create an integar array and initialize
        int array[] = new int[3];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

        System.out.println("---------------------------------------------------------------------------------");

        //Create the integar array and initialize it in a different way

        int[] array2 = {1,2,3};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    } 
}




