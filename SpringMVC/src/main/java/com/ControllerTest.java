package com;

import java.util.Map;
import java.util.TreeMap;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

import com.service.AddService;

@Controller
public class ControllerTest {
//	@RequestMapping("/test")
//	public ModelAndView test(HttpServletRequest request,HttpServletResponse response)
//	{
//		int i=Integer.parseInt(request.getParameter("t1"));
//		int j=Integer.parseInt(request.getParameter("t2"));
//		String string=request.getParameter("name");
//		int k=i+j;
//		int m=i*j;
//		
//		AddService addService=new AddService();
//		int k=addService.add(i, j);
//		int m=addService.mul(i, j);
//		
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("display");
//		mv.addObject("result", k);
//		mv.addObject("mul", m);
//		mv.addObject("name", string);
//		return mv;
//	}
	@RequestMapping("/test")
	public ModelAndView test(@RequestParam("username") String username, @RequestParam("password") String password)
	{
//		AddService aService=new AddService();
//		int k=aService.add(i, j);
//		int m=aService.mul(i, j);
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.setViewName("display");
//		modelAndView.addObject("result", k);
//		modelAndView.addObject("mul", m);
//		modelAndView.addObject("name", str);
//		
//		return modelAndView;
		
		ModelAndView mv=new ModelAndView();
		Configuration configuration=new Configuration().configure().addAnnotatedClass(Users.class);
		SessionFactory sf=configuration.buildSessionFactory();
		Session session=sf.openSession();
		Transaction txTransaction=session.beginTransaction();
		Query<Users> q1=session.createQuery("from Users where username='"+username  +"' and password='"+password+"'");
		
		Users users=q1.uniqueResult();
		
		if(users==null)
		{
			mv.setViewName("registration");
		}
		else {
			mv.addObject("fullname", users.getFullName());
			mv.setViewName("display");
		}
		
		return mv;
		
	}
	@RequestMapping("/registration")
	public ModelAndView registration(@RequestParam("fullname")String fullName,@RequestParam("username")String username,@RequestParam("password")String password)
	{
		ModelAndView mv=new ModelAndView();
		
		Configuration configuration=new Configuration().configure().addAnnotatedClass(Users.class);
		SessionFactory sf=configuration.buildSessionFactory();
		Session session=sf.openSession();
		Transaction txTransaction=session.beginTransaction();
		
		Users user=new Users();
		user.setFullName(fullName);
		user.setUsername(username);
		user.setPassword(password);
		
		session.save(user);
		txTransaction.commit();
		mv.setViewName("success");
		return mv;
	}
}
