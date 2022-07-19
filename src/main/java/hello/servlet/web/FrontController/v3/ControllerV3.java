package hello.servlet.web.FrontController.v3;

import hello.servlet.web.FrontController.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
