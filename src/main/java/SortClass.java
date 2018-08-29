import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortClass {

    public void listSort(){

    }

    public List<String> stringSplit(String stringForSplit){
        List<String> list = new ArrayList<String>();
        String a = "\\\\";
        String[] strings = stringForSplit.split(a);
        list = Arrays.asList(strings);
        return list;
    }

    public void compare(List<String> list1, List<String> list2){
        for(int i = 0; i < 3; i++){

        }
    }

}
