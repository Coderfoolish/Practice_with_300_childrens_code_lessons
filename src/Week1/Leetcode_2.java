package Week1;

import java.util.Stack;

public class Leetcode_2 {
    public boolean bai2(String s)
    {
        if(s.isEmpty())
            return true;
        Stack<String > stack = new Stack<>() ;
        for (int i = 0 ; i < s.length() ; i ++)
        {
            //trich xuat char hien tai transfrom thanh chuoi~
            String single = String.valueOf(s.charAt(i)) ;
            if ("{".equals(single))
                stack.push("}") ;
            else if("[".equals(single))
                stack.push("]");
            else if("(".equals(single))
                stack.push(")");
            //kiem tra ngoac dong
            else {
                if(stack.isEmpty())
                    return false;
                //lay dau ngoac mo tuong ung trong stack
                String currency = stack.pop();
                //kiem tra dau ngoac dong hien tai co khop voi dau ngoac
                // mo tren cung` cua stack hay khong
                if (!currency.equals(single))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
