package com.adcat.monitor.exception;

import com.adcat.monitor.dto.ResponseData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName("error");
//        return mav;
//    }

    @ExceptionHandler(value = JsonException.class)
    @ResponseBody
    public ResponseData jsonErrorHandler(HttpServletRequest req, JsonException e) throws Exception {
        ResponseData r = new ResponseData<>();
//        r.setTimestamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
        r.setStatus("success");
        r.setMsg(e.getMessage());
        r.setErrorCode(1);
        return r;
    }

}

