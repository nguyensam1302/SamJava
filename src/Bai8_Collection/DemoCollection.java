package Bai8_Collection;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {
        //Khai báo kiểu Set với loại Hashset
        Set<String> stringSet = new HashSet<>(); //Set: không chứa giá trị trùng lặp
        stringSet.add("abc");
        stringSet.add("2134");
        stringSet.add("123");

        System.out.println("số lượng phần tử: " + stringSet.size());

        for (String value : stringSet) {
            System.out.println(value);
        }
        System.out.println("===treeSet===");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("535345");
        treeSet.add("12345");
        treeSet.add("abc");
        treeSet.add("yeireuru");

        for (String value : treeSet) {
            System.out.println(value);
        }
        System.out.println("===List===");
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(456);
        listNumber.add(123);
        listNumber.add(9999);

        listNumber.set(2, 888); //Cập nhật giá trị

        for (int value : listNumber) {
            System.out.println(value);
        }

        //Truy xuất thông qua vị trí
        System.out.println("Vị trí 3: " + listNumber.get(2));

        System.out.println("===Map===");

        //Khai báo kiểu dữ liệu map
        Map<String, String> map = new HashMap<>();
        //Thêm giá trị dạng key=value
        map.put("name", "Sam");
        map.put("age", "32");
        map.put("address", "Ha Noi");

        //Truy xuất dữ liệu qua key
        System.out.println(map.get("name"));

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

    }
}



