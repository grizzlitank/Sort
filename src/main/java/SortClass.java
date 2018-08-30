import java.util.*;

public class SortClass{


    public List<String> listSort( List<List<String>> strings){
        for(int i = 0; i < strings.size(); i++){
            List<String> list = new ArrayList<String>(strings.get(i));
            if(list.size() == 3) list.remove(2);
            else if(list.size() == 2) list.remove( 1);
            int count = 0;
            for(List<String> listls : strings){
                if(list.equals(listls)) count++;
            }
            if(count == 0) strings.add(list);
        }
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
        List<String> listOfStrings = new ArrayList<String>();
        String a = "";
        for(List<String> list : strings){
            for(String b : list){
                if(b.startsWith("K")) a+=b; else a+= "\\" + b;
            }
            listOfStrings.add(a);
            a="";
        }
        return listOfStrings;
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
