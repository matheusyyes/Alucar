package br.com.alucar.confs;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.alucar.Dao.MotoDao;
import br.com.alucar.Dao.UsuarioDao;
import br.com.alucar.controller.LoginController;

@EnableWebMvc
@ComponentScan(basePackageClasses = {LoginController.class,UsuarioDao.class,MotoDao.class})
public class WepAppConfig {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	@Bean
	public FormattingConversionService mvcConversionService() {
		
		DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService(true);
		
		DateFormatterRegistrar registrar = new DateFormatterRegistrar();
		registrar.setFormatter(new DateFormatter("yyy-mm-dd"));
		registrar.registerFormatters(conversionService);
		return conversionService;
		
	}
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource bundle = new ReloadableResourceBundleMessageSource();
		bundle.setBasename("WEB-INF/messages");
		bundle.setDefaultEncoding("UTF-8");
		bundle.setCacheSeconds(1);
		return bundle;
	}
	
}
