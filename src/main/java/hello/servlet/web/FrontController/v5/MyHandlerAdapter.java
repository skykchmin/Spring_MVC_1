package hello.servlet.web.FrontController.v5;

import hello.servlet.web.FrontController.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {
    boolean supports(Object handler);   // Object가 넘어왔을 때 handler를 지원할 수 있는지 확인

    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
