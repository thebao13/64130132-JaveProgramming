/**
 * 
 */
package tbao.vn;
import java.util.Scanner;
/**
 * 
 */
public class TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO
		
	//tạo đối tượng để nhập dữ liệu tính thể tích
	    Scanner Thetich = new Scanner(System.in);
	    // cho nhập độ dài cạnh
        System.out.print("Nhập độ dài cạnh của khối lập phương: ");
        double canh = Thetich.nextDouble();
        //tính thể tích 
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích của khối lập phương là: " + theTich);

        Thetich.close();

	}

}
