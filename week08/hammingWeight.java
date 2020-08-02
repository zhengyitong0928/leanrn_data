package week08;

/*
* 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
* */
public class hammingWeight {

    public static void main(String[] args) {

//        System.out.println(getHint("1123","0111"));

    }

    public static int hammingWeight(int n) {
        int count =0;
        for (int i=0;i<32;i++) {
            if (((n>>i) & 1) == 1) {
                count ++;
            }
        }
        return count;
    }

}
