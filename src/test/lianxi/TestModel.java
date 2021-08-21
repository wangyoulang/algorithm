package test.lianxi;

import com.common.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestModel {
    @Test
    public void test(){
        /**
         * 子集
         */
        int[] source = new int[]{1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        recursion3(source,result,new ArrayList<>(),0);
        System.out.println();

    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode recursion(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode rev = recursion(head);
        head.next.next = head;
        head.next = null;
        return rev;
    }
    /**
     * 反转字符串
     * 输入：["h","e","l","l","o"]
     * 输出：["o","l","l","e","h"]
     */
    public void recursion(char[] s,int left,int right){
        if(left >= right){
            return;
        }
        recursion(s,left + 1,right - 1);
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
    /**
     * 子集
     * 输入：nums = [1,2,3]
     * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     * @param
     */
    public void recursion3(int[] source,List<List<Integer>> result,List<Integer> curr,int index){
        if(source.length == index){
            return;
        }
        for(int i = index;i < source.length;i ++){
            curr.add(source[i]);
            recursion3(source,result,curr,i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
