package com.lxg.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.lxg.po.User;
import com.lxg.service.UserService;

@Controller

@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public ModelAndView userList()throws Exception{
		
		List<User> list = userService.UserList();
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("itemsList", list);
		
		modelAndView.setViewName("userList");
		
		return modelAndView;
	}

	@RequestMapping("editUser")
	public String editUser(Model model,@RequestParam(value="id",required=true) Integer user_id)throws Exception {
		User user = userService.findItemsById(user_id);
		model.addAttribute("user", user);
		
		return "editUser";
	}
	
	@RequestMapping("/edit")
	public String edit(User user)throws Exception{
		boolean flag = userService.editUser(user);
		
		if(flag)
			return "list.action";
		else
			return "error";
		
	}
	@RequestMapping("/editUserSubmit")
	public String editUserSubmit(HttpServletRequest request,Integer id,User user)throws Exception {
		userService.updateUser(id, user);
		//		return "redirect:queryItems.action";
		//页面转发
		return "forward:list.action";
		//return "success";
	}
	
	@RequestMapping("/delUser")
	public String delUser(Integer id) throws Exception{
		userService.delUser(id);
		return "forward:list.action";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user) throws Exception{
		userService.addUser(user);
		return "forward:list.action";	
	}
}
