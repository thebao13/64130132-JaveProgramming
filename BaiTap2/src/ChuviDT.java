/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class ChuviDT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập chiều dài của hình chữ nhật: ");
	        double chieuDai = scanner.nextDouble();

	        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
	        double chieuRong = scanner.nextDouble();
//chu vình hình chữ nhật
	        double chuVi = 2 * (chieuDai + chieuRong);
	        //diện tích 
	        double dienTich = chieuDai * chieuRong;
	        //tìm cạn nhỏ
	        double canhNho = Math.min(chieuDai, chieuRong);
// in in
	      
	        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
	        System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
	        System.out.println("Cạnh nhỏ của hình chữ nhật là: " + canhNho);

	        
	        scanner.close();

	}

}
