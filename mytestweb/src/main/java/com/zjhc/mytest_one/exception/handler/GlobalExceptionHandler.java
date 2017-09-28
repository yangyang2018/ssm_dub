package com.zjhc.mytest_one.exception.handler;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/9/28 0028.
 */
public class GlobalExceptionHandler implements HandlerExceptionResolver{

    private static Logger logger = Logger.getLogger(GlobalExceptionHandler.class);

    private static final String REQUESETWITH = "X-Requested-With";
    private static final String ERROR_PAGE = "error/error";
    private static final String AJAX_ERROR_PAGE = "error/ajax/error";

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        logger.error(e.getMessage(),e);
        /**
         * 如果是ajax请求，跳转到illegalParamUrl提示错误
         */
        if(isAjaxRequest(request)){
            try {
                    ModelAndView m = new ModelAndView(AJAX_ERROR_PAGE);
                    m.addObject("ErrorMessage", e.getMessage());
                    response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                    return m;
            } catch (Exception e1) {
                logger.error(e1.getMessage(),e1);
            }
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("ErrorMessage",e.getMessage());
        mav.setViewName(ERROR_PAGE);
        return mav;
    }

    private boolean isAjaxRequest(HttpServletRequest request){
        return request.getHeader(REQUESETWITH) != null
                && request.getHeader(REQUESETWITH).equalsIgnoreCase("XMLHttpRequest");
    }

}
