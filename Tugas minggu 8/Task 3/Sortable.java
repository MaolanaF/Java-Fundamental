package inheritanceabstractclassinterface.Tugas3;

/**
 *
 * @author Maolana
 */

abstract class Sortable {
    public abstract int Compare(Sortable b);
	//source: https://www.geeksforgeeks.org/shellsort/
	public static void shell_sort(Sortable[] a) {
            int n = a.length;
            // Start with a big gap, then reduce the gap
            for (int gap = n/2; gap > 0; gap /= 2){
            // Do a gapped insertion sort for this gap size.
    
            for (int i = gap; i < n; i += 1){
                Sortable temp = a[i];
                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && a[j - gap].Compare(temp) < 0; j -= gap)
                    a[j] = a[j - gap];
                // put temp (the original a[i]) in its correct
                // location
                a[j] = temp;
            }
        }
    }
}
