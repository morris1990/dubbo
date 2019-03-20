import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.fastjson.JSON;
import org.apache.commons.collections.ArrayStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by morriswang on 3/19/19.
 */
public class CommonUtils {

    public static <T> List<List<T>> split(List<T> input, int size) {

        if (CollectionUtils.isEmpty(input)) {
            return new ArrayList<>();
        }

        int arraysCount = input.size() / size;
        List<List<T>> lists = new ArrayList<>();
        for (int i = 0; i < arraysCount; i++) {
            List<T> temp = input.subList(i * size, (i + 1) * size);
            lists.add(temp);
        }
        int extra = input.size() % size;
        if (extra != 0) {
            List<T> temp = input.subList(arraysCount * size, arraysCount * size + extra);
            lists.add(temp);
        }

        return lists;
    }

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        List<List<Integer>> listArrays = CommonUtils.split(list, 6);
        System.out.println(JSON.toJSONString(listArrays));
    }
}
