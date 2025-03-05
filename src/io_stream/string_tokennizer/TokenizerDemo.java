package io_stream.string_tokennizer;

import java.util.StringTokenizer;

public class TokenizerDemo {

    public static void main(String[] args) {
        String s="You are the creater of the world";
        StringTokenizer st=new StringTokenizer(s,"a",true);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}