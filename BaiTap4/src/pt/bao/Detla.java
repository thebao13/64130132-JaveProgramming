/**
 * 
 */
package pt.bao;
import java.util.Scanner;
/**
 * 
 */
public class Detla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		  	System.out.println("Phương trình có dang ax^2 + bx + c = 0");
		  	System.out.print("Nhập hệ số a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Nhập hệ số b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Nhập hệ số c: ");
	        double c = scanner.nextDouble();

	        //b bình trừ 4ac
	        double delta = b * b - 4 * a * c;

	        // Kiểm tra giá trị của delta
	        if (delta < 0) {
	            System.out.println("Delta âm, phương trình vô nghiệm thực.");
	        } else {
	            // Tính căn delta
	            double canDelta = Math.sqrt(delta);

	            // Xuất kết quả ra màn hình
	            System.out.println("Giá trị của delta là: " + delta);
	            System.out.println("Căn của delta là: " + canDelta);
	        }
	        scanner.close();
	}

}
