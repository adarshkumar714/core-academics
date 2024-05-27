// package revison;

public class arrays {
    public static void main(String[] args) {
        int[] a = {9};
        a[0] = 3;
        System.out.println(a[0]); // 3


        int[] b = new int[10];
        System.out.println(b[7]); // 0

        int[] c = {1,2,5,6};
        System.out.println(c[2]); // 5
        System.out.println(c.length); // 4
        for(int i:c){
            System.out.print(i);
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }

        int[][] d = {{2,5,3}, {7,2,1,6}};

        System.out.println();

        String name = "asdfsad";
        System.out.println(name.indexOf("d"));

    }
}
