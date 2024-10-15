package school.ch01;

import java.util.Scanner;
 /* 숫자로 된 파일 권한 해석하기
 * 파일명: FilePermissionChecker.java
 */
public class FilePermissionChecker {
    public static void main(String[] args) {
        Scanner      in = new Scanner(System.in);
        System.out.print("입력: ");
        int permission = in.nextInt();
        String result = (permission < 0 || permission > 7) ? "잘못된 권한 숫자" : "";
        if(result.isEmpty()) {
            result += (permission & 4) != 0 ? "r" : "-";
            result += (permission & 2) != 0 ? "w" : "-";
            result += (permission & 1) != 0 ? "x" : "-";
        }
        System.out.println("파일 권한: "+ result);
    }
}
