/**   
*  
*/
package com.aaronj.manager.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.aaronj.manager.def.LogConstant;
import com.aaronj.manager.po.LoginInfo;
import com.aaronj.manager.service.impl.LoginServiceImpl;
import com.aaronj.manager.utils.MD5Util;

/** 
 * @ClassName: LoginController 
 * @Description:  
 * @author TangJie 
 * @date 2014年12月14日 下午6:42:45 
 *  
 */

@Controller
public class LoginController {
	
	@Autowired
	private LoginServiceImpl loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView  login(@RequestParam String loginName,@RequestParam String pwd,HttpSession session){
		LoginInfo loginInfo  = loginService.userLogin(loginName,MD5Util.getMD5(pwd));
		ModelAndView view = null;
		if(loginInfo==null){
		session.setAttribute(LogConstant.LOGINERR, "用户名或者密码不正确");
		view = new ModelAndView(new RedirectView("login.jsp"));
		}else{
		session.setAttribute(LogConstant.LOGINSUC, loginInfo);
		view = new ModelAndView(new RedirectView("main.jsp"));
		}
		return view;
	}
}
