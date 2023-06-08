package com.ai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ai.beans.Radio;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {
		 @SuppressWarnings("deprecation")
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ai/common/application-context.xml"));
		Radio radio =  (Radio) beanFactory.getBean("radio","Radio.class");
		radio.listen(98);
		
	}

}
