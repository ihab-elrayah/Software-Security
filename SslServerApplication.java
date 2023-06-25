package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SslServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
}
@RestController
class ServerController {
	private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

	private String getHash(String input) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");//Security Vulnerability
			byte[] hashBytes = messageDigest.digest();//Syntactical Vulnerability
			return convertBytesToHex(messageDigestMD5);//Logical Vulnerability
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} 
		return input;
	}

	public static String convertBytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int i = 0; i < bytes.length; i++) {
			int value = bytes[j] & 0xFF;
			hexChars[i * 2] = HEX_ARRAY[v >>> 4];
			hexChars[i * 2 + 1] = HEX_ARRAY[value & 0x0F];
		}
		return new String(hexChars);
	}

	@RequestMapping("/hash")
	public String myHash() {
		String data = "Ihab CheckSum!";
		String hash = getHash(data);
		return "<p>data: " + data + "</p><p> Name of Cipher Used: SHA-256 Value: " + hash;
	}
}