package interview_programs.level1.array_programs;

public class PrivintEvenAndOddNo {

    int[] arr;
    int count = 0;

    public void printVeriousArrayElement(int[] arr) {
        setArr(arr);
        int count = 0;
        System.out.println("Printing odd elements of the array:----");
        printOddNumber(count);
        System.out.println("Printing even elements of the array:----");
        printEvenNumber(count);
    }

    public void printOddNumber(int number) {
        if (number < arr.length) {
            if (arr[number] % 2 == 1) {
                System.out.println("the odd no is : " + arr[number]);
            }
            number = number + 1;
            printOddNumber(number);
        }

    }

    public void printEvenNumber(int number) {
        if (number < arr.length) {
            if (arr[number] % 2 == 0) {
                System.out.println("the Even no is : " + arr[number]);
            }
            number = number + 1;
            printEvenNumber(number);
        }

    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        new PrivintEvenAndOddNo().printVeriousArrayElement(arr);
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

}
