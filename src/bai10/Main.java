package bai10;

import java.util.Scanner;

public class Main {

    static int count =0;


    public static void main(String[] args) {

        String A ="A";
        Scanner sc = new Scanner(System.in);
        VanBan vanban = new VanBan();


        System.out.println("Nhập văn bản");
        String a = sc.nextLine();
        String b = a.toUpperCase();

        System.out.println("Chiều dài văn bản là:"+ b.length());

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i)==65) {
                count ++;
}
        }
        System.out.println("Số lượng ký tự A( không phân biệt hoa thường) của văn bản là :"+ count);
        System.out.print("Văn bản sau khi xóa khoảng trắng thừa: " );
        System.out.println(a.replaceAll("\\s\\s+", " ").trim());

}


    }

