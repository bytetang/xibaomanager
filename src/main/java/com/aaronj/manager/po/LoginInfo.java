/**   
*  
*/
package com.aaronj.manager.po;

/** 
 * @ClassName: LoginInfo 
 * @Description: 登陆用户信息 
 * @author TangJie 
 * @date 2014年12月14日 下午8:40:54 
 *  
 */
public class LoginInfo {
	
	private String loginName;
	private String pwd;
	private int grade;
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
