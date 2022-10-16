public class Main2 {

    public static void main(String[] args) {
        // First level: 1. Написать свою реализацию MergeSort
        //Отсортировать стрингу use MergeSort
        //Почитать MergeSort VS QuickSort
        //Second level: 4. *Найти индекс какого то символа в строке(без повторов) [ можно псевдокод ]

        //*String[] a = {"1,2-4", "3-6", "2,5,7-11", "5"} -> Integer[] i = {1,2,3,4,3,4,5,6,2,5,7,8,9,10,11,5}

        String str = "qwertyuioplkjhgfdsamnbvcxz";
        char[] chars = str.toCharArray();
        char s = 'a';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == s)
                System.out.println(i);
        }

    }
}
