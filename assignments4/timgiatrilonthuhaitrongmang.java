
package assignments4;


public class timgiatrilonthuhaitrongmang {
    public static void main(String[] args) {
        float[] array = {3.5f, 1.2f, 4.7f, 2.8f, 5.0f};

        try {
            float secondLargest = findSecondLargest(array);
            System.out.println("gia tri lon nhat phan tu thu 2 la: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    
    public static float findSecondLargest(float[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("mang phai co it nhat 2 phan tu.");
        }

        float largest = Float.NEGATIVE_INFINITY;  
        float secondLargest = Float.NEGATIVE_INFINITY;  

        for (float num : array) {
            if (num > largest) {
                secondLargest = largest;  
                largest = num;  
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;  
            }
        }

        if (secondLargest == Float.NEGATIVE_INFINITY) {
            throw new IllegalArgumentException("khong the tim gia tri lon thu 2.");
        }

        return secondLargest;
    }
}

