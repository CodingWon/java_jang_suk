package ch9_java_lang_package_useful_class;

import java.util.Arrays;

public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        /*1. 참조값 복사 */
        int[] arrRef = arr;
        System.out.println("참조값 복사 : " + Arrays.toString(arrRef));


        /*2. clone 을 사용해서 array 복사하기 */
        int[] arrClone = arr.clone();
        arrClone[0] =6;

        System.out.println("원본 _ arr : " + Arrays.toString(arr));
        System.out.println("clone 사용 _ arrClone: " + Arrays.toString(arrClone));

        /*3. Arrays.copyOf() 사용해서 복사 */
        int[] newScores = Arrays.copyOf(arr,arr.length);
        int[] partialNewScores = Arrays.copyOf(arr,3);

        System.out.println("Arrays.copyOf() _ newScores : " + Arrays.toString(newScores));
        System.out.println("Arrays.copyOf() _ partialNewScores : " + Arrays.toString(partialNewScores));

        /*4. System.*/
        int [] sysArrCopy = new int[5];

        System.arraycopy(arr,0,sysArrCopy,0,arr.length);
        System.out.println("System.arraycopy() _ sysArrCopy : " + Arrays.toString(sysArrCopy) );


    }
}
