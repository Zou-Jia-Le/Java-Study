package com.imooc.practice_14_17_7;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //创建Book类对象
        Book book1 = new Book("水浒传");
        Book book2 = new Book("三国演义");
        Book book3 = new Book("红楼梦");
        Book book4 = new Book("西游记");
        //创建古典文学list集合
        List<Book> classicalLiteratureList = new LinkedList<>();
        classicalLiteratureList.add(book1);
        classicalLiteratureList.add(book2);
        classicalLiteratureList.add(book3);
        classicalLiteratureList.add(book4);

        //创建Book类对象
        Book book5 = new Book("繁星");
        Book book6 = new Book("春水");
        Book book7 = new Book("边城");
        Book book8 = new Book("朝花夕拾");
        //创建近代文学list集合
        List<Book> modernLiteratureList = new LinkedList<>();
        modernLiteratureList.add(book5);
        modernLiteratureList.add(book6);
        modernLiteratureList.add(book7);
        modernLiteratureList.add(book8);

        //创建Book类对象
        Book book9 = new Book("沙丘");
        Book book10 = new Book("流浪地球");
        Book book11 = new Book("宇宙往事");
        Book book12 = new Book("三体");
        Book book13 = new Book("银河帝国");
        Book book14 = new Book("死神永生");
        //创建科幻小说list集合
        List<Book> scienceFictionList = new LinkedList<>();
        scienceFictionList.add(book9);
        scienceFictionList.add(book10);
        scienceFictionList.add(book11);
        scienceFictionList.add(book12);
        scienceFictionList.add(book13);
        scienceFictionList.add(book14);

        //创建map集合
        Map<String,List<Book>> totalBookMap = new LinkedHashMap<>();
        totalBookMap.put("古典文学",classicalLiteratureList);
        totalBookMap.put("近代文学",modernLiteratureList);
        totalBookMap.put("科幻小说",scienceFictionList);

        //打印map集合
        Iterator<Map.Entry<String,List<Book>>> totalBookMapIterator = totalBookMap.entrySet().iterator();
        while (totalBookMapIterator.hasNext()) {
            Map.Entry<String,List<Book>> next = totalBookMapIterator.next();
            System.out.print(next.getKey() + ":[");
            List<Book> booklist = next.getValue();
            for (int i = 0; i < booklist.size(); i++) {
                if (i < booklist.size() - 1) {
                    System.out.print(booklist.get(i) + ",");
                } else {
                    System.out.print(booklist.get(i));
                }
            }
            System.out.println("]");
        }
    }
}
