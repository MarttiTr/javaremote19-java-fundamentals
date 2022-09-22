public class Array {
    public static void main(String[] args) {



        int a = 9;

        //Singel-dimensional array
        //NOTE: Array index always starts with 0. Array´s can contain duplicate elements.
        //int array
        int[] b = {9, 27, 40, 20, 839, 11000, 27 , 40}; // This is array, can use only same type of variable!

        //String array                         // Arrays can be used with any datatypes.
        String[] fruits = {"apple", "orange", "mango", "", "banana"};   // 0 - apple, 1 - orange, 2 - mango

        System.out.println(fruits[0]);
        System.out.println(b[4]);
        System.out.println(fruits[3]);  // Array index out of bound
        System.out.println(b.length);   // Return the number of values in the array
        System.out.println(b.length - 1); // Returns array´s last index

        //Defined array
        int[] veggies = new int[5]; //New object

        veggies[3] = 65;
        veggies[4] = 45;

        System.out.println(veggies[2]);

        String[] food = new String[] {"cake", "orange", "rice"};

        int[] ageArray = new int[3];



        //Processing array (loops are used)
        //Conventional for
        for(int i=0; i < fruits.length; i++) {    // i = index of array
            System.out.println(fruits[i]);
        }
        //Enhanced for-loop
        for(String fruit: fruits) {       //int: int[]
            System.out.println(fruit);
        }

        //Find the largest element in the array
        //Brute-force method
        int result = b[0]; //9

        for(int x: b) {
            if (x > result) {
                result = x;
            }
        }
        System.out.println(result);


       //Multi dimensional array
        //2D array
        int[][] array2d = new int[3][3];

        //Row 1
        array2d[0][0] = 1;
        array2d[0][1] = 0;
        array2d[0][2] = 1;

        //Row 2
        array2d[1][0] = 2;
        array2d[1][1] = 10;
        array2d[1][2] = 9;

        //Row 3
        array2d[2][0] = 4;
        array2d[2][1] = 9;
        array2d[2][2] = 8;

        int[][] array2dver2 = {   {1, 0 , 1}, {2, 10, 9}, {4, 9, 8}   };

        //Using for loop to print 2d array

        for(int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(array2dver2[x][y] + " ");
            }
            System.out.println();
        }

        System.out.print("hello world"); //Print prindib samale reale, println võtab uue rea.
        System.out.println("hello world");


        System.out.println("hello\nworld\nAvengers\tApple"); //Lihtsalt näide kuidas sama println commandiga saab erinevatele ridadele kirjutada.
        //\t - 6 spaces. \n - uus rida


        //3D array = 1D + 2D array
        //1D array => number of tables
        //2D array => array with rows and columns(table)

        int[][][] array3d = new int[3][3][3];     //Esimene nr näitab mitu tablet on, teine number mitu rida on tables(ülevalt-alla), kolmas mitu rida on tables(vasakult-paremale)

        //Table 1
        //Row 1
        array3d[0][0][0] = 1;
        array3d[0][0][1] = 0;
        array3d[0][0][2] = 1;

        int[][][] array3dVer2 = {
                                {{1, 0, 1},{1, 8, 0},{2, 5, 7}},
                                {{9, 8, 7},{5, 8, 9},{3, 5, 0}},
                                {{5, 6, 2},{4, 5, 7},{2, 6, 8}}
                                };

            //Print 3D array

        for(int z = 0; z < 3; z++) {
            for (int q = 0; q < 3; q++) {
                for (int e = 0; e < 3; e++) {
                    System.out.print(array3dVer2[z][q][e] + " ");
                }
                System.out.println();
            }
            System.out.println("\n");
        }


        }
    }
