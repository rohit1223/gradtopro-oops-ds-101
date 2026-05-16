package JavaProgrames;
class ArrayExample  {
    public static void main(String[] args) {

        int[] arr = new int[5]; //initalization of an array of size 5

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        // [0,1,2,3,4]

        System.out.println("Old value");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }   

        System.out.println("\n");

        System.out.println(arr[4]);

        arr[3] = 30; // update the value at index 3

        System.out.println("\n \nNEW value");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }   

        char[] charArr = new char[3]; // initalization of a char array of size 3
        charArr[0] = 'a';
        charArr[1] = 'b';
        charArr[2] = 'c';   
        // [a,b,c]

        System.out.println("\n \nChar Array");

        String str = "abc"; // initalization of a string
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}