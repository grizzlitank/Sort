public class Main {
    public static void main(String[] args) {
        SortClass sortClass = new SortClass();
        System.out.println(
                SortList.sortList
        );
        sortClass.listSort(sortClass.getList(SortList.sortList));
        System.out.println(
                SortList.sortList
        );

    }
}
