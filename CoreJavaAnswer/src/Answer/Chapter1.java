package Answer;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Chapter1 {
    public static void main(String[] args) {
        
        //1
//        Scanner aNum = new Scanner(System.in);
//        System.out.print("Please Input A Number: ");
//        int inputNum = aNum.nextInt();
//        
//        System.out.println("2进制：" + Integer.toString(inputNum, 2));
//        System.out.println("8进制：" + Integer.toString(inputNum, 8));
//        System.out.println("16进制：" + Integer.toString(inputNum, 16));
//        
//        double revNum = Integer.parseInt(Integer.toString(inputNum), 16);
//        System.out.print("16进制倒数：" + Double.toString(1/revNum));
        
        //2
//        int target = 3401;
//        System.out.println(target%360);
//        System.out.println(Math.floorMod(target, 360));
        
        //3
//        Scanner threeNum = new Scanner(System.in);
//        System.out.print("Please Input 3 Numbers (with spaces as intevals): ");
//        int a = threeNum.nextInt();
//        int b = threeNum.nextInt();
//        int c = threeNum.nextInt();
//        int result = a;
//        if(result < b) {
//            result = b;
//            if(result < c) {
//                result = c;
//            }
//        }
//        System.out.println(result);
//        System.out.println(Math.max(a, Math.max(b, c)));
        
        //4
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE); //和Integer的MIN_VALUE不一样；
//        System.out.println(Math.nextUp(0.0)); //nextUp方式；
        
        //5
//        double aDouble = (double) (Integer.MAX_VALUE + 1);
//        System.out.println((int) aDouble);
//        System.out.println(Integer.MIN_VALUE);
        
        //6
//        BigInteger aBigInteger = new BigInteger("1");
//        System.out.println(aBigInteger);
//        int n = 1000;
//        for(int i = 1; i < (n+1); i++) {
//            aBigInteger = aBigInteger.multiply(new BigInteger(Integer.toString(i)));
//        }
//        System.out.println(aBigInteger);
        
        //7 ?   不知道怎么做，不是很理解题目的意思；
//        short shortA;
//        short shortB;
//        Random aRandom = new Random();
//        shortA = (short) aRandom.nextInt(65535);
//        shortB = (short) aRandom.nextInt(65535);
//        
//        System.out.println(shortA + shortB);
//        System.out.println(shortA - shortB);
//        System.out.println((short) (shortA * shortB));
//        System.out.println(shortA / shortB);
//        System.out.println(shortA % shortB);
        
        //8
//        String str = "Hel   lo, World!";
//        String[] re = str.split("");
//        for(String s : re) {
//            System.out.print(s.trim());   //if判断也可以，\t会被分割为四个空格；
//        }
        
        //9
//        String strA = "Hello";
//        String strB = String.join("", "He","llo");  //用"+"不行；
//        System.out.println(strA == strB);
//        System.out.println(strA.equals(strB));
        
        //10
//        Random anotherRandom = new Random();
//        long aLong = anotherRandom.nextLong();
//        char chA = (char) (anotherRandom.nextInt(26) + 65);
//        char chB = (char) (anotherRandom.nextInt(26) + 97);
//        System.out.println(String.valueOf(chA) + chB + Math.abs(aLong%36)); //可能为负数，不好看，所以加了个abs；
        
        //11
//        String str11 = "我是shui？我从哪里lai？要往哪里qu？";
//        int[] codePoints = str11.codePoints().toArray();
//        for(int i : codePoints) {
//            if(i > 128) {
//                System.out.print("\"" + (char) i + "\": ");
//                System.out.println(i);
//            }
//        }
        
        //12
        
        //13
//        int[] ballCase = new int[49];
//        for(int i = 1, j = 0; i < 50; i++, j++) {
//            ballCase[j] = i;
//        }
//        
//        ArrayList result = new ArrayList();
//        Random random13 = new Random();
//        for(int i = 0, j = 49; i < 6; i++, j--) {
//            int temp13 = random13.nextInt(j);
//            result.add(i, ballCase[temp13]);
//        }
//        
//        Collections.sort(result);
//        System.out.println(result);
        
        //14
//        //先获取输入；
//        Scanner sc14 = new Scanner(System.in);
//        System.out.println("Please input your array: ");
//        int lines = 0;
//        String temp14 = sc14.nextLine();
//        ArrayList<String> input14 = new ArrayList<String>();
//        while(!(temp14.equals(""))) {
//            input14.add(temp14);
//            lines++;
//            temp14 = sc14.nextLine();
//        }
//        System.out.println(input14);    //测试一下对不对；
//        
//        //得到数值；
//        int[][] nums14 = new int[input14.size()][input14.size()];
//        for(int i = 0; i < input14.size(); i++) {
//            String[] tempStr14 = input14.get(i).split(" ");
//            for(int j = 0; j < tempStr14.length; j++) {
//                nums14[i][j] = Integer.parseInt(tempStr14[j]);
//            }
//        }
//        System.out.println(Arrays.deepToString(nums14));    //再测试一下对不对；
//        
//        //进行判断；
//        int tempResult = 0;     //用于存储求和的值；
//        int tempResultDJ1 = 0;  //用于存储对角求和的值；
//        int tempResultDJ2 = 0;  //用于存储另一个对角求和的值；
//        boolean notACube = false;   //状态参数，用于for循环break之后的处理方式判断，这样的话，不用完成所有计算，只要发现有一个不一致就可以直接跳出去并显示结果了；
//        for(int i = 0; i < nums14.length; i++) {
//            int sumLine = 0;
//            int sumColumn = 0;
//            for(int j = 0; j < nums14[0].length; j++) {
//                sumLine = sumLine + nums14[i][j]; 
//                sumColumn = sumColumn + nums14[j][i];       //这里利用了行列数量一致的特性，求出第n行的和的同时也求出了第n列的和；
//            }
//            
//            if(i == 0) {
//                tempResult = sumLine;
//                if(sumColumn != tempResult) {
//                    notACube = true;
//                    break;
//                }
//            } else if((sumLine != tempResult) || (sumColumn != tempResult)) {
//               notACube = true;
//               break;
//            }
//            
//            tempResultDJ1 = tempResultDJ1 + nums14[i][i];
//            tempResultDJ2 = tempResultDJ2 + nums14[i][nums14.length - 1 - i];
//        }
//        
//        if(notACube) {
//            System.out.println("Not a cube!");
//        } else if((tempResult != tempResultDJ1) || (tempResult != tempResultDJ2)) {
//            System.out.println("Not a cube!");
//        } else {
//            System.out.println("It\'s a cube!");
//        }
        
        //15
//        Scanner sc15 = new Scanner(System.in);
//        int n15 = sc15.nextInt();
//        ArrayList<ArrayList<Integer>> outer = new ArrayList();
//        for(int i = 0; i < n15; i++) {
//            ArrayList tempList = new ArrayList();
//            tempList.add(1);
//            for(int j = 1; j < i; j++) {
//                tempList.add(outer.get(i-1).get(j-1) + outer.get(i-1).get(j));
//            }
//            if(i > 0) {
//                tempList.add(1);
//            }
//            outer.add(tempList);
//        }
//        
//        for(int i = 0; i < n15; i++) {
//            System.out.println(outer.get(i));
//        }
        
        //16
//        System.out.println(average(3, 4.5, 10, 0));
    }
    
    //16
//    public static double average(double first, double... rest) {
//        double sum = first;
//        for(double v : rest) sum += v;
//        return rest.length == 0 ? sum : sum / (rest.length + 1);
//    }
}
