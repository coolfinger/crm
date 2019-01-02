/**
 * 
 */
package com.crm.wcx.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 
 * @ClassName: Md5Util 
 * @Description: TODO
 * @author: CoolFingers
 * @date: 2018年11月10日 上午10:11:32
 */
public class Md5Util {
    
    /**
     * 加密算法
     */
    private static String algorithmName = "md5";
    /**
     * 加密算法迭代加密次数
     */
    private static int hashIterations = 2;
    
    /**
     * 
    * @Title: encrypt 
    * @Description: 对信息进行MD5盐值加密 
    * @param message
    * @param salt
    * @return String
    * @author CoolFingers
    * @date 2018年11月10日上午10:11:44
     */
    public static String encrypt(String message, String salt){
        SimpleHash hash = new SimpleHash(algorithmName, message, salt, hashIterations);
        return hash.toHex();
    }
    
    
}
