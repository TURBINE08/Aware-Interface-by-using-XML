package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Radio implements BeanFactoryAware  {

	private BeanFactory beanFactory;
	
	public void listen(int frequency)
	{
		IReceiver receiver = (IReceiver) beanFactory.getBean("alphaReceiver","IReceiver.class");
		receiver.tune(frequency);
		System.err.println("listing......");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		
	}
}
