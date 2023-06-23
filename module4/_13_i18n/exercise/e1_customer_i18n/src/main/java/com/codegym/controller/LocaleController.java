package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class LocaleController {
    @GetMapping("changeLocale")
    public String changeLocale(HttpServletRequest request, Locale locale) {
        System.out.println(locale);
        request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale("haw"));

        return "redirect:/customer";
    }
}
