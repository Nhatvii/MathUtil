/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vi.ulti;

/**
 *
 * @author Admin
 */
//đây là class chứa các hàm tiện ích xài chung cho các nơi khác
//nó chứa các hàm bổ tro72j cho cac 1 class khác 
//đó là bổ trợ xài chung nên là static
public class MathUtil {

    //mình chỉ nên tính n < 15 vì 201 to lắm
    public static long computeFactorial(int n) {
        long result = 1;
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("N must be >= 0 and  n <= 10");
        }
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
