package com.niit.shoppingcart.dao;

public class UserDAO {
	public boolean isValidCredentials(String uid,String pwd){
		if(uid.equals("NIIT")&& pwd.equals("1234"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
