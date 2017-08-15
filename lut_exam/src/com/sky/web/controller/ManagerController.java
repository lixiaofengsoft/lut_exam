package com.sky.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sky.bean.Course;
import com.sky.bean.ExamPaper;
import com.sky.bean.Manager;
import com.sky.bean.Student;
import com.sky.service.ICourseService;
import com.sky.service.IExamPaperService;
import com.sky.service.IExamQuestionService;
import com.sky.service.IManagerService;
import com.sky.service.IStudentService;

/**
 * 
 * @author Feng
 *
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {		
	@Autowired
	IManagerService managerService;
	
	@Autowired
	IStudentService studentService;
	
	@Autowired
	ICourseService courseService ;
	@Autowired
	IExamPaperService examPaperService;
	@Autowired
	IExamQuestionService examQuestionService;
/**
 * 登陆验证	
 * @param name
 * @param password
 * @param req
 * @return
 */
	//登陆页面验证
	@RequestMapping(value="/login2")
	public String login2(String name,String password,HttpServletRequest req){
		Manager manager = managerService.findManagerByName(name,password);
		if(manager!=null){
			HttpSession session = req.getSession();
			session.setAttribute("manager", manager);
			return "redirect:homepage";
		}
		req.setAttribute("error", "用户名或密码错误");
		
		return "error";
	}
/**
 * 首页
 * @return
 */
	//首页
    @RequestMapping("/homepage")
    public String home() {
      return "homepage";
    }

    
/**
 *  考生管理   
 * @return
 */    
    //分页查找
    @RequestMapping("/stumanager")
    public String stumanager(HttpServletRequest request, Model model) {
    	
    	System.err.println("in controller  stumanager-----------");
    	this.studentService.showStudentsByPage(request, model);
    	
    	
      return "stumanager";
    }
    //模糊查询学生
    @RequestMapping("/searchStu")
    public String searchStu(String stuId,String name, Model model) {
    	System.err.println("in controller  searchStu-----------"+stuId+"--"+name);
    	Map<String,Object> map = new HashMap<String,Object>(); 
    	System.out.println("%"+stuId+"%");
    	if(!"".equals(stuId)){
    		map.put("stuId", stuId);
    	}
    	if(!"".equals(name)){
    		map.put("name", "%"+name+"%");
    	}
    	if("".equals(stuId)&&"".equals(name)){
    		return "redirect:stumanager";
    	}
    	studentService.searchStudents(map, model);
    	return "stumanager1";
    }
    //删除一个学生
    @RequestMapping("/studel")
    public String studel(HttpServletRequest request) {
    	
    	System.err.println("in controller  studel-----------");
    	this.studentService.delStudentById(request);
    	
    	
    	return "redirect:stumanager";
    }
    
    
    

    //添加考生页面
    @RequestMapping("/addStudent")
    public String addStudent() {
    	
    	System.err.println("in controller  addStudent-----------");
    	return "addStudent";
    }
    //添加考生信息到数据库
    @RequestMapping(value="/addStuMsg",method=RequestMethod.POST)
    public String addStuMsg(Student student) {
    	
    	System.err.println("in controller  addStuMsg-----------");
    	System.err.println(student);
    	studentService.addStudent(student);
    	
    	return "redirect:stumanager";
    }

    
/**
 * 添加管理员
 * @return
 */
    //添加管理员页面
    @RequestMapping("/addManager")
    public String addManager() {
    	
    	System.err.println("in controller  addStudent-----------");
    	return "addManager";
    }
    
    //添加管理员信息到数据库
    @RequestMapping(value="/addMgrMsg",method=RequestMethod.POST)
    public String addMgrMsg(Manager mangaer) {
    	
    	System.err.println("in controller  addStuMsg-----------");
    	studentService.addManager(mangaer);
    	
    	return "addMgrS";
    }
    //添加编辑页面
    @RequestMapping("/stuedit")
    public String editStudent(HttpServletRequest request, Model model) {
    	
    	System.err.println("in controller  editStudent-----------");
    	
    	this.studentService.editStudent(request, model);
    	
    	return "editStudent";
    }
    //添加编辑考生信息到数据库
    @RequestMapping(value="/editStuMsg",method=RequestMethod.POST)
    public String editStuMsg(Student student) {
    	
    	System.err.println("in controller  editStuMsg-----------");
    	System.err.println(student);
    	studentService.addStudent(student);
    	
    	return "redirect:stumanager";
    }
    
    
    
    
/**
 * //课程管理  
 * @param request
 * @param model
 * @return
 */
    //分页课程查找
    @RequestMapping("/course")
    public String coursemanager(HttpServletRequest request, Model model) {
    	
    	System.err.println("in controller  coursemanager-----------");
    	this.courseService.showCourseByPage(request, model);
    	return "course";
    }
    //删除一个课程
    @RequestMapping("/coudel")
    public String coudel(HttpServletRequest request) {
    	
    	System.err.println("in controller  coudel-----------");
    	
    	this.courseService.delCourseById(request);
    	return "redirect:course";
    }
    //添加课程页面
    @RequestMapping("/addCourse")
    public String addCourse() {
    	return "addCourse";
    }
    //添加课程信息到数据库
    @RequestMapping(value="/addCouMsg",method=RequestMethod.POST)
    public String addCouMsg(Course course) {
    	
    	this.courseService.addCourse(course);
    	
    	return "redirect:course";
    }
    //添加编辑页面
    @RequestMapping("/couedit")
    public String editCourse(HttpServletRequest request, Model model) {
    	
    	this.courseService.editCourse(request, model);
    	return "editCourse";
    }
    //添加编辑kecheng信息到数据库
    @RequestMapping(value="/editCouMsg",method=RequestMethod.POST)
    public String editCouMsg(Course course) {
    	
    	courseService.addCourse(course);
    	
    	return "redirect:course";
    }
/**
 * 试卷管理  
 * @return
 */
    //分页课程试题查找
    @RequestMapping("/exampaper")
    public String exampaper(HttpServletRequest request, Model model) {
    	
    	this.examPaperService.selectAllExamPaper(request,model);
    	return "exampaper";
    }
    //删除一个试题
    @RequestMapping("/perdel")
    public String perdel(HttpServletRequest request) {
    	
    	System.err.println("in controller  coudel-----------");
    	
    	this.examPaperService.delPaPerById(request);
    	return "redirect:exampaper";
    }
    //添加课程页面
    @RequestMapping("/addPer")
    public String addPer(Model model) {
    	this.examPaperService.selectAllCourse(model);
    	return "addPer";
    }
    //添加shiti信息到数据库
    @RequestMapping(value="/addPreMsg",method=RequestMethod.POST)
    public String addPreMsg(ExamPaper examPaper) {
    	System.err.println(examPaper);
    	this.examPaperService.insertPaPer(examPaper);
    	return "redirect:exampaper";
    }
    //添加编辑页面
    @RequestMapping("/peredit")
    public String peredit(HttpServletRequest request, Model model) {
    	
    	this.examPaperService.editCourse(request, model);
    	return "editPer";
    }
    //添加编辑kecheng信息到数据库
    @RequestMapping(value="/editPreMsg",method=RequestMethod.POST)
    public String editPreMsg(ExamPaper examPaper) {
    	
    //	this.examPaperService.insertPaPer(examPaper);
    	this.examPaperService.updatePaPer(examPaper);
    	return "redirect:exampaper";
    }
    
 /**
  * 试题管理   
  */
    //分页课程试题查找
    @RequestMapping("/question")
    public String question(HttpServletRequest request, Model model) {
    	this.examQuestionService.selectAllExamQuestion(request, model);
    	
    	return "question";
    }
    
    //删除一个ti
    @RequestMapping("/quedel")
    public String quedel(HttpServletRequest request) {
    	
    	this.examQuestionService.delQuestionById(request);
    	return "redirect:question";
    }
    
    
    //添加试题页面
    @RequestMapping("/addQue")
    public String addQue(Model model) {
    	this.examQuestionService.queryCourse(model);
    	return "addQue";
    }
//    //添加shiti信息到数据库
//    @RequestMapping(value="/addQueMsg",method=RequestMethod.POST)
//    public String addQue(ExamPaper examPaper) {
//    	System.err.println(examPaper);
//    	this.examPaperService.insertPaPer(examPaper);
//    	return "redirect:exampaper";
//    }
    
/*	  @RequestMapping(value="/peredit")
	  public String peredit1(HttpServletRequest request,Model model) {
		  examQuestionService.selectQuestion(request, model);
		  
		//  return "editQuestion";
		  return null;
	  }*/
    
    
/**
 *修改密码         
 * @return
 */

    //修改密码页面
    @RequestMapping("/updatepw")
    public String updatepw() {
      return "updatepw";
    }
    
    //判断密码修改页面
    @RequestMapping("/udpwss")
    public String udpwss(String pw1,String pw2,HttpSession session,HttpServletRequest req) {
    			
    	
    	
	    	Manager m = (Manager) session.getAttribute("manager");
	    /*	if(m==null||"".equals(m)){
	    		
	    		return:"redirect:"
	    		res.sendRedirect(req.getContextPath()+"/login2");
	    	}*/
	    	String name = m.getName();
	    	String password = m.getPassword();
	    	if(password.equals(pw1)){
	    		Manager manager = new Manager(name,pw2);
	    		managerService.updateManager(manager);
	    		
	    		return "updatepwsuccess";
	    	}
    	return "updatepwerr";
    	}
}

