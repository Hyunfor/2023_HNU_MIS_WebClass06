package com.mis.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mis.javabeans.MemberBean;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		// 1. 요청 파라미터에서 로그인 정보 추출
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		int userType = Integer.parseInt(request.getParameter("userType"));

		// 2. MemberBean 객체 생성 및 로그인 정보 저장
		MemberBean member = new MemberBean();
		member.setUserId(userId);
		member.setUserPwd(userPwd);
		member.setUserType(userType);

		// 3. 세션에 로그인 정보 저장
		HttpSession session = request.getSession();
		session.setAttribute("member", member);

		// 4. main.jsp 페이지로 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
		dispatcher.forward(request, response);
	}

}
