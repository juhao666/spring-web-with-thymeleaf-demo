package com.juhao666.apilife.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Slf4j
//@Order(value = Ordered.HIGHEST_PRECEDENCE)
// todo : implement it.
public class CustomHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            response.sendError(500, "system error, please try it again later...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ModelAndView();//
    }
}
