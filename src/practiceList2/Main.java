package practiceList2;

//6.	Элемент двусвязного циклического списка содержит ссылку на строку в динамической памяти.
//        Написать методы просмотра списка и включения очередной строки с сохранением упорядоченности
//        по длине строки и алфавиту

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.insertLast("b");
        list.insertLast("a");
        list.insertLast("c");
        list.insertLast("casd");
        list.insertLast("bb");
        list.insertLast("aaaa");
        list.insertLast("abcd");
        list.insertLast("aaaa");
        list.insertLast("da");
        list.insertLast("ad");
        list.printList("список после добавления в него случайных строк");
        list.sort();
        list.printList("список после сортировки по размеру и алфавиту");
        list.insertSort("d");
        list.insertSort("abaa");
        list.insertSort("dddd");
        list.printList("список после добавления строк методом сохраняющим упорядоченность списка");
    }
}