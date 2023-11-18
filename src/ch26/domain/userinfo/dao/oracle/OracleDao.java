package ch26.domain.userinfo.dao.oracle;

import ch26.domain.userinfo.UserInfo;
import ch26.domain.userinfo.dao.UserInfoDao;

public class OracleDao implements UserInfoDao{
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert UserInfo to Oracle " + userInfo.getName());
	}
	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete UserInfo to Oracle " + userInfo.getName());
	}
	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update UserInfo to Oracle " + userInfo.getName());
	}
}
