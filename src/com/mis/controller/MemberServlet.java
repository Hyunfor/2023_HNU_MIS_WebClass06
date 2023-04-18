package com.mis.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1 ) MemberBean에 정보 담기
		MemberBean member = new MemberBean();
		member.setUserid("admin1234");
		member.setName("관리자");
		member.setEmail("naver@gmail.com");
		member.setNickname("딴돈에 반만 가져가");
		member.setPhone("010-112-119");
		member.setUserpwd("1234");
		
		// 2 ) request 속성에 MemberBean 담기
		request.setAttribute("member", member);
		
		// 3 ) 페이지 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher("memberInfo.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
