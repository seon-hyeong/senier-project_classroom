package com.seon.project;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.seon.project.model.AssignFileVO;
import com.seon.project.model.AssignVO;
import com.seon.project.model.User;
import com.seon.project.service.AssignService;

@Controller
@RequestMapping("/assign/")
public class AssignController {	
	@Autowired
	AssignService service;

	// 수업등록 get
	@RequestMapping(value = "/assignRegister", method = RequestMethod.GET)
	public ModelAndView getRegiser(AssignVO Assign) throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("assignRegister");
		// service.register(user);

		return view;
	}

	// 수업등록 post
	@RequestMapping(value = "/assignRegister", method = RequestMethod.POST)
	public ModelAndView postRegister(AssignVO Assign, ModelMap model, HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		String classNum = request.getParameter("classNum");
		String assignName = request.getParameter("assignName");
		
		HttpSession session = request.getSession();
		session.setAttribute("classNum", classNum);
		session.setAttribute("assignName", assignName);
		
		view.setViewName("redirect:/");

		service.assignRegister(Assign);
		System.out.println("assign: " + Assign);
		System.out.println("classNum: " + classNum);

		return view;
	}

	@RequestMapping(value ="/classAssign", method = RequestMethod.GET)
	public ModelAndView getAssign(@RequestParam("classNum") String classNum ,Model model,User user,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		HttpSession session = request.getSession();
		String isMaster = (String) session.getAttribute("isMaster");
		
		List<AssignVO> list = service.assignList(classNum);
		model.addAttribute("list", list);
		view.setViewName("classAssign");
		
		System.out.println("isMaster" + isMaster);
		
	
		return view;
		
	}
	
	@RequestMapping(value ="/classAssign2", method = RequestMethod.GET)
	public ModelAndView getAssign2(@RequestParam("classNum") String classNum ,Model model,User user,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		HttpSession session = request.getSession();
		String isMaster = (String) session.getAttribute("isMaster");
		
		List<AssignVO> list = service.assignList(classNum);
		model.addAttribute("list", list);
		view.setViewName("classAssign2");
		
		System.out.println("isMaster" + isMaster);
		
	
		return view;
		
	}
	
	@RequestMapping(value ="/classAssign3", method = RequestMethod.GET)
	public ModelAndView getAssign3(@RequestParam("classNum") String classNum ,Model model,User user,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		HttpSession session = request.getSession();
		String isMaster = (String) session.getAttribute("isMaster");
		
		List<AssignVO> list = service.assignList(classNum);
		model.addAttribute("list", list);
		view.setViewName("classAssign3");
		
		System.out.println("isMaster" + isMaster);
		
	
		return view;
		
	}
	
	@RequestMapping(value ="/assignDetail", method = RequestMethod.GET)
	public ModelAndView getDetail(@RequestParam("assignName") String assignName, Model model,User user,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		HttpSession session = request.getSession();
		String isMaster = (String) session.getAttribute("isMaster");
		String userName = (String) session.getAttribute("userName");

		session.getAttribute("assignName");
		
		AssignVO detail = service.assignDetail(assignName);
		model.addAttribute("detail", detail);
		view.setViewName("assignDetail");

		return view;
	}
	
	@RequestMapping(value ="/assignDetail", method = RequestMethod.POST)
	public ModelAndView postDetail(AssignFileVO AssignFile, Model model,User user,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		HttpSession session = request.getSession();
		
		String assignGrade = request.getParameter("assignGrade");
		String assignName = request.getParameter("assignName");
		session.setAttribute("assignName", assignName);
		session.setAttribute("assignGrade", assignGrade);
		
		service.assignGrade(AssignFile);
	
		view.setViewName("classAssign");
	
		
		return view;
	}
	
	@RequestMapping(value ="/assignDetail2", method = RequestMethod.GET)
	public ModelAndView getDetail2(AssignFileVO AssignFile, Model model,User user,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		HttpSession session = request.getSession();
		String isMaster = (String) session.getAttribute("isMaster");
		
		session.getAttribute("assignName");
		
		AssignFileVO detail = service.assignfileDetail(AssignFile);
		model.addAttribute("detail", detail);
		view.setViewName("assignDetail2");

		return view;
	}
	
	@RequestMapping(value ="/assignDetail2", method = RequestMethod.POST)
	public ModelAndView postDetail2(AssignFileVO AssignFile, Model model,User user,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		HttpSession session = request.getSession();
		String isMaster = (String) session.getAttribute("isMaster");
		String userName = (String) session.getAttribute("userName");
		
		String assignGrade = request.getParameter("assignGrade");
		String assignName = request.getParameter("assignName");
		String userId = request.getParameter("userId");
		session.setAttribute("assignName", assignName);
		session.setAttribute("assignGrade", assignGrade);
		session.setAttribute("assignGrade", userId);
		
		service.assignGrade(AssignFile);

		view.setViewName("assignDetail2");

		return view;
	}
	
	@RequestMapping(value ="/assignGrade", method = RequestMethod.GET)
	public ModelAndView getGrade(AssignFileVO AssignFile, Model model,User user,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		HttpSession session = request.getSession();
		String isMaster = (String) session.getAttribute("isMaster");
		
		AssignFileVO detail = service.getGrade(AssignFile);
		model.addAttribute("detail", detail);
		
		System.out.println("detail" + detail);
		
		view.setViewName("assignGrade");
		
		return view;
	}
	
	@RequestMapping(value ="/assignGrade", method = RequestMethod.POST)
	public ModelAndView postGrade(AssignFileVO AssignFile, Model model,User user,HttpServletRequest request,RedirectAttributes rttr) throws Exception {
		ModelAndView view = new ModelAndView();
			
		service.assignGrade(AssignFile);	
		view.setViewName("assignGrade");
			
		return view;
	}
	
	
	@RequestMapping(value = "Calendar", method=RequestMethod.GET)
	public String Calendar() {
		
		return "/Calendar";
	}
	
	@RequestMapping(value ="/upload", method = RequestMethod.GET)
	public ModelAndView getFile(Model model,User user,HttpServletRequest request) throws Exception {
		ModelAndView view = new ModelAndView();
		
		HttpSession session = request.getSession();
		String assignName = (String) session.getAttribute("assignName");
		String isMaster = (String) session.getAttribute("isMaster");
		
		AssignVO detail = service.assignDetail(assignName);
		model.addAttribute("detail", detail);
		
		System.out.println("assignName2" + assignName);
		System.out.println("detail" + detail);
		
		view.setViewName("myRoom");
		
		return view;
	}
	
	@RequestMapping(value = "/upload" , method = RequestMethod.POST)
	public String insertFile(AssignFileVO AssignFile,HttpServletRequest request) throws IOException {
		HttpSession session = request.getSession();
		String assignName = request.getParameter("assignName");
		session.setAttribute("assignName", assignName);
		
		String assignFile = null;
		
		MultipartFile uploadFile = AssignFile.getUploadFile();
		if (!uploadFile.isEmpty()) {
			String originalFileName = uploadFile.getOriginalFilename();
			String ext = FilenameUtils.getExtension(originalFileName);	//확장자 구하기
			UUID uuid = UUID.randomUUID();	//UUID 구하기
			assignFile=uuid+"."+ext;
			uploadFile.transferTo(new File("C:\\Users\\SeonHyeong\\FileUpload\\" + assignFile));
		}
		AssignFile.setAssignFile(assignFile);
		service.insertFile(AssignFile);
		
		System.out.println("assignFile" + assignFile);
		
		return "myRoom";
	}
	
	@RequestMapping(value = "/fileDownload")
    public void fileDownload4(HttpServletRequest request,HttpServletResponse response) throws Exception {
        //String path =  request.getSession().getServletContext().getRealPath("저장경로");
        
        String assignFile =request.getParameter("assignFile");
        String realFilename="";
        System.out.println(assignFile);
         
        try {
            String browser = request.getHeader("User-Agent"); 
            //파일 인코딩 
            if (browser.contains("MSIE") || browser.contains("Trident")
                    || browser.contains("Chrome")) {
            	assignFile = URLEncoder.encode(assignFile, "UTF-8").replaceAll("\\+",
                        "%20");
            } else {
            	assignFile = new String(assignFile.getBytes("UTF-8"), "ISO-8859-1");
            }
        } catch (UnsupportedEncodingException ex) {
            System.out.println("UnsupportedEncodingException");
        }
        realFilename = "C:\\Users\\SeonHyeong\\FileDownload\\" + assignFile;
        System.out.println(realFilename);
        File file1 = new File(realFilename);
        if (!file1.exists()) {
            return ;
        }
         
        // 파일명 지정        
        response.setContentType("application/octer-stream");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + assignFile + "\"");
        try {
            OutputStream os = response.getOutputStream();
            FileInputStream fis = new FileInputStream(realFilename);
 
            int ncount = 0;
            byte[] bytes = new byte[512];
 
            while ((ncount = fis.read(bytes)) != -1 ) {
                os.write(bytes, 0, ncount);
            }
            fis.close();
            os.close();
        } catch (Exception e) {
            System.out.println("FileNotFoundException : " + e);
        }
    }
	
	@RequestMapping(value = "myRoom", method=RequestMethod.GET)
	public ModelAndView myRoom(User user, HttpSession session) {
		ModelAndView view = new ModelAndView();
		view.setViewName("myRoom");
		
		return view;
	}
}
