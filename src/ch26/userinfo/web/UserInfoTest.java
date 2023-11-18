package ch26.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch26.domain.userinfo.UserInfo;
import ch26.domain.userinfo.dao.UserInfoDao;
import ch26.domain.userinfo.dao.mysql.MySQLDao;
import ch26.domain.userinfo.dao.oracle.OracleDao;

public class UserInfoTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setName("sky1234");
		userInfo.setPassword("@abcd");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("MYSQL")) {
			userInfoDao = new MySQLDao();
		}else if(dbType.equals("Oracle")) {
			userInfoDao = new OracleDao();
		}else {
			System.out.println("ERROR");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		
	}

}
