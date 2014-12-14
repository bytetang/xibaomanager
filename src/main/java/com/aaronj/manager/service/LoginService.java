/**   
*  
*/
package com.aaronj.manager.service;

import com.aaronj.manager.po.LoginInfo;

/** 
 * @ClassName: LoginService 
 * @Description: 
 * @author TangJie 
 * @date 2014年12月14日 下午8:56:10 
 *  
 */

public interface LoginService {
    
	/**
	 * 
	 * @param loginname
	 * @param pwd
	 * @return
	 */
	public LoginInfo userLogin(String loginname,String pwd);
}
