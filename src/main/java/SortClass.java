import java.util.*;

public class SortClass{


    public void listSort( List<List<String>> strings){
        Collections.sort(strings, new Comparator<List<String>>() {

            public int compare(List<String> list1, List<String> list2) {
                if (list1.size() == list2.size()) {
                    for (int i = 0; i < list1.size(); i++) {
                        if(getLast(list1.get(i)) > getLast(list2.get(i))) {
                            return -1;
                        }
                        if(getLast(list1.get(i)) < getLast(list2.get(i))) {
                            return 1;
                        }
                    }
                }
                if (list1.size() > list2.size()) {
                    for (int i = 0; i < list2.size(); i++) {
                        if(getLast(list1.get(i)) > getLast(list2.get(i))) return -1;
                        if(getLast(list1.get(i)) < getLast(list2.get(i))) return 1;
                    }
                    return -1;
                }
                if (list1.size() < list2.size()) {
                    for (int i = 0; i < list1.size(); i++) {
                        if(getLast(list1.get(i)) > getLast(list2.get(i))) return -1;
                        if(getLast(list1.get(i)) < getLast(list2.get(i))) return 1;
                    }
                    return 1;
                }
                return 0;
            }
        });
    }

    public List<String> stringSplit(String stringForSplit){
        List<String> list = new ArrayList<String>();
        String a = "\\\\";
        String[] strings = stringForSplit.split(a);
        list = Arrays.asList(strings);
        return list;
    }

    public List<List<String>> getList(List<String> list){
        List<List<String>> listOfLists = new ArrayList<List<String>>();
        for(String s : list){
            listOfLists.add(stringSplit(s));
        }
        return listOfLists;
    }


    public int getLast(String string){
        return Integer.parseInt(string.substring(string.length()-1));
    }


}
