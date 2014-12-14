/**   
*  
*/
package com.aaronj.manager.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.aaronj.manager.po.LoginInfo;


/** 
 * @ClassName: LoginMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author TangJie 
 * @date 2014年12月14日 下午8:49:22 
 *  
 */

@Repository(value="loginMapper")
public interface LoginMapper {
	
	@Select("select loginName,pwd,grade from sysuser where "
			+ "loginName=#{loginName} and pwd=#{pwd}")
	public LoginInfo login(@Param(value="loginName") String loginName,@Param(value="pwd") String pwd);
	
}
