package logicprograms;

public class FindIntersection {
	
	public static void main(String[] args) {

        int[] a = {3, 2, 11, 4, 6, 7};
        int[] b = {1, 2, 8, 4, 9, 7};

        int aLength = a.length;
        int bLength = b.length;

        for (int i = 0; i < aLength; i++) {
            for (int j = 0; j < bLength; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }

}
