package LineSort;

public class LineSortUtils {

    /**
     * 计数排序 通过确定a[i]前边有多少个元素来确定a[i]的位置
     * 适用于数据范围k远小于数据个数n时
     * 计数排序是桶排序的一种特殊情况，即每个桶内的数据都是相同的，省掉了桶内数据快速排序的时间
     * @param a
     * @param n
     */
    public static void countSort(int[] a, int n){
        if(n<=1)
            return;
        //查找数组中的数据范围
        int max = a[0];
        for(int i = 0; i<n; i++){
            if(a[i]>=max){
                max=a[i];
            }
        }

        //申请一个计数数组c,下标范围为[0,max]
        //这个新建的数组可以优化，开始位置即下标0位置处可以表示要排序的数据中的最小数
        int[] c = new int[max+1];

        for(int i = 0; i<n; i++){
            c[a[i]]++;
        }

        for(int i = 1; i<max+1; i++){
            c[i]=c[i]+c[i-1];
        }

        //申请一个临时数组，存放排序之后的结果
        int[] temp = new int[n];

        for(int i = 0; i<n; i++){
            int index = c[a[i]]-1;
            temp[index]=a[i];
            c[a[i]]--;
        }

        for(int i = 0; i<n; i++){
            a[i] = temp[i];
        }
    }

    /**
     * 基数排序
     * 适用于数据范围较大的大量数据排序
     * @param a
     * @param n
     */
    public static void radixSort(int[] a, int n){

    }

}
