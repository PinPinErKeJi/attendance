package com.xio.attendance.handle;

import com.xio.attendance.dto.RequestMap;
import org.springframework.core.MethodParameter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

/**
 * 用于分装request，正常的请求过来，在这里装载
 */
@Service
public class RequestMapArgumentResolver implements HandlerMethodArgumentResolver {

    //@Autowired
    //private EmployeeService employeeService;


    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        //如果参数类型是User并且有CurrentUser注解则支持
        if (methodParameter.getParameterType().isAssignableFrom(RequestMap.class) ) {
            return true;
        }
        return false;
    }

    @Nullable
    @Override
    public Object resolveArgument(MethodParameter methodParameter, @Nullable ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, @Nullable WebDataBinderFactory webDataBinderFactory) throws Exception {
        if(methodParameter.getParameterType() != null
                && methodParameter.getParameterType().equals(RequestMap.class)){

            //判断controller方法参数有没有写当前用户，如果有，这里返回即可，通常我们从session里面取出来

            HttpServletRequest request = nativeWebRequest.getNativeRequest(HttpServletRequest.class);
            RequestMap requestMap = new RequestMap(request);
            //
            try {
                String auth = request.getHeader("Authorization");
                if(auth != null && !auth.trim().isEmpty()){
                    //Employee employee = employeeService.detailByToken(auth);
                    //requestMap.setLoginEmployee(employee);
                }
            }catch (Exception ex){

            }
            return requestMap;
        }
        return null;
    }
}
