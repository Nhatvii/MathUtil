/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import vi.ulti.MathUtil;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

    //class này muốn chạy thì nó có main() riêng, nhấn Shift-F6 để chạy
    //mỗi hàm trong class này sẽ biến thành main() //  nhiều main() trong 1 class 
    // 1 class luôn , thì hàm cần phải có kí hiệu/ đường dẫn annotation test
    @Test
    public void testSuccessFulCases() {
        //test tham số tử tế
//        assertEquals(30, 40);
//        assertEquals(30, 30);
        assertEquals(1, MathUtil.computeFactorial(0));
        assertEquals(1, MathUtil.computeFactorial(1));
        assertEquals(2, MathUtil.computeFactorial(2));
        assertEquals(6, MathUtil.computeFactorial(3));
        assertEquals(24, MathUtil.computeFactorial(4));
        assertEquals(120, MathUtil.computeFactorial(5));

    }

    //
    @Test(expected = IllegalArgumentException.class)
    public void testFailesCases() {
        //test tham số cà chớn
        //điều gí sẽ xảy ra nếu  ng dùng muốn tính cF(-5)
        //xin lỗi tính ko đc , quăng ra message chửi ng dùng
        //và ngoại lệ là q tính huống bất thường ko như đự định
        //và ko phải value có thể so sánh đc
        // ko thể xái hàm assertEquals()
        // ta phải xài chiếu khác

        MathUtil.computeFactorial(-5);
    }
    // Hàm trả về màu đỏ do ko ném về ngoại lệ như kì vọng 
    //code mình còn sai trong tính huống số âm, số dương đã màu xanh r
    // hàm còn sai về logic
    //nhưng cho dú viết kiểu cũ sout() bên main() hay assertEqual() bên JUnit thì code sai logic/ màu đỏ vẫn ko ngăn đc nút clean and build
    // tức là code ko sai cú pháp vẫn sản xuất ra fiel .jar, .war
    //JUnit có thể kết hợp vs ANT đề cấm ra file .jar nếu code còn màu đỏ
    //disable nút bamy61 clean&build trong lúc vẫn còn chạy
    //@Test
    //Hãy nhớ 2 con số: 1005 NETBEANS 8, 1204 NETBEANS 10 trở lên
}
