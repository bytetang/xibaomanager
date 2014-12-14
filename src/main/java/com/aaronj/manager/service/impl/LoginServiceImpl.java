/**   
*  
*/
package com.aaronj.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaronj.manager.dao.LoginMapper;
import com.aaronj.manager.po.LoginInfo;
import com.aaronj.manager.service.LoginService;

/** 
 * @ClassName: LoginServiceImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author TangJie 
 * @date 2014年12月14日 下午9:05:35 
 *  
 */

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginMapper loginMapper;

	/* (non-Javadoc)
	 * @see com.aaronj.manager.service.LoginService#userLogin(java.lang.String, java.lang.String)
	 */
	public LoginInfo userLogin(String loginname, String pwd) {
		return loginMapper.login(loginname, pwd);
	}

}
