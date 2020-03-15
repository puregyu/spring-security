package xyz.devyu.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class FailureHandler implements AuthenticationFailureHandler{

	private String loginidname;
    private String loginpwdname;
    private String errormsgname;
    private String defaultFailureUrl;

	public String getLoginidname() {
		return loginidname;
	}
	public void setLoginidname(String loginidname) {
		this.loginidname = loginidname;
	}
	public String getLoginpwdname() {
		return loginpwdname;
	}
	public void setLoginpwdname(String loginpwdname) {
		this.loginpwdname = loginpwdname;
	}
	public String getErrormsgname() {
		return errormsgname;
	}
	public void setErrormsgname(String errormsgname) {
		this.errormsgname = errormsgname;
	}
	public String getDefaultFailureUrl() {
		return defaultFailureUrl;
	}
	public void setDefaultFailureUrl(String defaultFailureUrl) {
		this.defaultFailureUrl = defaultFailureUrl;
	}


	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 로그인 실패 후 실행되는 메서드
    */
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		System.out.println("로그인 실패 후 실행되는 메서드,");
		
		String username = request.getParameter(loginidname);
        String password = request.getParameter(loginpwdname);
        String errorMsg = exception.getMessage();
        
        request.setAttribute("loginId", username);
        request.setAttribute("loginPw", password);
        request.setAttribute("loginError", errorMsg);
 
        System.err.println(defaultFailureUrl);
        request.getRequestDispatcher(defaultFailureUrl).forward(request, response);

	}
}
