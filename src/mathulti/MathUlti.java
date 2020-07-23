/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathulti;

import static vi.ulti.MathUtil.computeFactorial;

/**
 *
 * @author Admin
 */
public class MathUlti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + computeFactorial(5));

        //khi ta viết code xong ta / dev phải test xem hàm hay class chạy có đúng ko
        //việc này gọi là unit test, test mức hàm, mức class, mức dvi
        //test = cách đưa data vào hàm , class , chạy hàm xem kết quả trả về
        //(actual claue) rồi ta so kq có đúng nhu87 ta mong đợi ko
        //nếu actual  = expected value hàm xử lý đúng như mong đợi
        // nếu ko bằng t among dợi sai hoặc hảm sai
        //trong main() ta sout() ra kết quả actual so sánh với kết quả mong đợi
        //
        //expected : 1,  hi vọng 1 nhưng khi chạy ra 10 dc gọi ra actual
        System.out.println("1! = " + computeFactorial(1));
        //expected: 0
        System.out.println("0!  = " + computeFactorial(0));
        //expected: chửi cà chớn nếu đưa vảo cà chớn
        System.out.println("-5! = " + computeFactorial(-5));
    }
    //cách test bằng mắt thì có nhiều rủi ro
    //dễ bị rối mắt và sai sót
    //giang hồ có 1 cách test bằng hàm /app xem chạy có đúng ko
    //bằng cách gọi hàm với data đưa vào tự so sánh với kq actual 
    //expected nếu đúng -> màu xanh
    //          nếu sau -> màu đỏ
    //Xanh: tất cả phải xanh
    //Đỏ:  1 trong đám bị đỏ tất cả bị đỏ
    //màu xanh: khớp giữa expected và actual do đó nếu có 1 cái ko khớp
    //màu đỏ: chứng minh 1 điều hàm lúc đúng lúc sai ->  ko tốt
    //để làm điều này t cần đồ chơi/thư viện phụ trợ 
    // để nó tự so sánh giùm expected vs actual , in ra màu sắc
    //thư viện này là : JUnit, TestNG(Java)
    //                  xUnit, NUnit, MSUnit(C#)
    //                  PHPUnit
    //                  CPPUnit
    //      ...
    // .jar, .dll, ...
}
