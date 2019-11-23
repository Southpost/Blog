package com.lrm.blog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author 追梦
 */
public class MD5Utils {
    /**
     * MD5加密类
     * @param str 要加密的字符串
     * @return  加密后的字符串
     */
    public static String code(String str){
      try{
          MessageDigest messageDigest=MessageDigest.getInstance("MD5");
          messageDigest.update(str.getBytes());
          byte[] byteDigest=messageDigest.digest();
          int i;
          StringBuilder buffer=new StringBuilder("");
          for (byte b : byteDigest) {
              i = b;
              if (i < 0) {
                  i += 256;
              }
              if (i < 16) {
                  buffer.append("0");
              }
              buffer.append(Integer.toHexString(i));
          }
          //32位加密
          return buffer.toString();
//          16位加密
//          return buffer.toString().substring(8,24);
      } catch (NoSuchAlgorithmException e) {
          e.printStackTrace();
          return null;
      }
    }

    public static void main(String[] args) {
        System.out.println(code("5201314"));
    }
}
