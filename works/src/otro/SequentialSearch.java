package otro;

import java.util.ArrayList;

public class SequentialSearch
{
    public int search(ArrayList<Integer> arr, int x)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr.get(i) == x)
                return i;
        }
        return -1;
    }
}
