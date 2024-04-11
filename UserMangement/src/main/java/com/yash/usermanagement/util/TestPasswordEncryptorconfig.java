package com.yash.usermanagement.util;

import org.jasypt.encryption.StringEncryptor;


import com.yash.usermanagement.config.PasswordEncryptorConfig;

public class TestPasswordEncryptorconfig {
	
	
	public static void main(String[] args) {
		
	
		PasswordEncryptorConfig obj = new PasswordEncryptorConfig();
		StringEncryptor stringEncryptor = obj.stringEncryptor();

		String password = "samarth@1994";

		String encryptedPassword = stringEncryptor.encrypt(password);

		System.out.println("encryptedPassword : " + encryptedPassword);
		

	}

}
