package LineSort;

import org.junit.Test;

public class LineSortTest {

    @Test
    public void countTest(){
        int a[] = {4,9,4,3,5,7,2,6,4,5,8};
        LineSortUtils.countSort(a,a.length);
        for(int i : a){
            System.out.println(i);
        }
    }



}
