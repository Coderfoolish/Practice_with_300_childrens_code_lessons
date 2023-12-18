package Week1;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_1 {
    //Giai phap trau bo
    public int[] twoSum (int[] nums , int target )
    {
        for ( int i = 0 ; i < nums.length ; i++)
            for ( int j = i +1; j <nums.length ;j++ )
                if( nums[j] == target- nums[i] )
                {
                    return new int[] {i , j };
                }

        throw new IllegalArgumentException("Khong co ket qua");
    }
    //Giai phap voi mãng băm
    public int[] twoSum2 (int[] arr , int target)
    {
        Map<Integer , Integer> map = new HashMap<>() ;
        for ( int i = 0 ; i < arr.length ; i ++)
        {
            int soKhac = arr[i] - target ;
            //Duyet qua hashmap xem co gia tri "soKhac" ton tai hay chua
            if (map.containsKey(soKhac))
                return new int[] {map.get(soKhac) , i} ;
            //day no vao hasmap
            map.put(arr[i] , i ) ;
        }
        throw new IllegalArgumentException("Khong co ket qua ") ;
    }

}
