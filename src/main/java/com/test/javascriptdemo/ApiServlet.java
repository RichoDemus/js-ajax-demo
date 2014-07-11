package com.test.javascriptdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1, urlPatterns = "/api")
public class ApiServlet extends HttpServlet
{
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void init() throws ServletException
	{
		logger.info("ApiServlet.init()");
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		logger.info("ApiServlet.doGet()");
		resp.getOutputStream().write("<html><body>Api</body></html>".getBytes());
	}
}
