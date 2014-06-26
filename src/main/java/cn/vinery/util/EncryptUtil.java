/*
 * Copyright 2014, Cui Tao.
 */
package cn.vinery.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密
 */
public class EncryptUtil {

	/**
	 * 对字符串加密,加密算法使用MD5,SHA-1,SHA-256,默认使用SHA-256
	 * 
	 * @param strSrc
	 *            要加密的字符串
	 * @param encName
	 *            加密类型
	 * @return
	 */
	public static String encrypt(final String arg, String encName) {

		byte[] bt = arg.getBytes();
		if (StringUtil.isEmpty(encName)) {
			encName = "SHA-256";
		}
		try {
			MessageDigest md = MessageDigest.getInstance(encName);
			md.update(bt);
			return bytes2Hex(md.digest());
		} catch (NoSuchAlgorithmException e) {
		}
		return null;
	}

	private static String bytes2Hex(byte[] bts) {
		String des = "";
		for (int i = 0; i < bts.length; i++) {
			String tmp = (Integer.toHexString(bts[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
	}

	public static void main(String[] args) {
		System.out.println(EncryptUtil.encrypt("123456", null));
	}
}
