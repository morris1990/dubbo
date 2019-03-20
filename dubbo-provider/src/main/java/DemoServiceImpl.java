import java.util.ArrayList;
import java.util.List;

/**
 * Created by morriswang on 3/15/19.
 */
public class DemoServiceImpl implements DemoService{

    @Override
    public List<String> getNames() {
        List<String> nameList = new ArrayList<>();
        nameList.add("morris");
        nameList.add("ella");
        return nameList;
    }
}
