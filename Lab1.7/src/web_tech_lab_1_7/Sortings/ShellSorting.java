package web_tech_lab_1_7.Sortings;

/**
 * Created by Сергей on 16.09.2016.
 */
public class ShellSorting {
    private void Swap (double[] array,int a, int b){
        double temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public void Sort(double[] array){
        int size = array.length;
        int step = size / 2;
        while (step > 0)
        {
            for (int i = 0; i < (size - step); i++)
            {
                int j = i;
                while (j >= 0 && array[j] > array[j + step])
                {
                    Swap(array,j,j+step);
                    j--;
                }
            }
            step = step / 2;
        }
    }
}
