package string.stringbuffer;

public class StringBufferDemo {

    public static void main(String[] args) {
    StringBuffer sb=new StringBuffer();

        System.out.println(sb.capacity());
        long start= System.currentTimeMillis();
//        System.out.println(start);
        sb.append("aadi3e3u3n  iefiehi ehee uie eijoeio euou euoeuioef euoe ejaoih ozhuchv ia98 38ey3 3");
       sb= sb.reverse();
        long end= System.currentTimeMillis();
        System.out.println(end-start);
    }
}
