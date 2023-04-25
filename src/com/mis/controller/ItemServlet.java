package com.mis.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mis.javabeans.ItemBean;
import com.mis.javabeans.MemberBean;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/ItemServlet")
public class ItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ItemServlet() {
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

		 // 1. 요청 파라미터에서 아이템 입력 정보 추출
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        String user = request.getParameter("user");

        // 2. ItemBean 객체 생성 및 아이템 정보 저장
        ItemBean item = new ItemBean();
        item.setName(name);
        item.setPrice(price);
        item.setDescription(description);
        item.setUser(user);


        // 3. 세션에 아이템 정보 저장
        HttpSession session = request.getSession();
        session.setAttribute("item", item);

        // 4. iteminfo.jsp 페이지로 이동
        RequestDispatcher dispatcher = request.getRequestDispatcher("iteminfo.jsp");
        dispatcher.forward(request, response);
	}

}
