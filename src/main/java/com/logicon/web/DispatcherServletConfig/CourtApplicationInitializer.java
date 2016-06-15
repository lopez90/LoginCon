package com.logicon.web.DispatcherServletConfig;

import com.logicon.service.config.TextViewConfig;
import com.logicon.web.config.WebConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CourtApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {TextViewConfig.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfiguration.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/", "/welcome"};
    }
}