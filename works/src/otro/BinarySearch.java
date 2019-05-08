package otro;

import java.util.ArrayList;

public class BinarySearch
{
    public int search(ArrayList<Integer> arr, int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;

            if (arr.get(mid) == x)
                return mid;

            if (arr.get(mid) > x)
                return search(arr, l, mid-1, x);

            return search(arr, mid+1, r, x);
        }

        return -1;
    }

}
