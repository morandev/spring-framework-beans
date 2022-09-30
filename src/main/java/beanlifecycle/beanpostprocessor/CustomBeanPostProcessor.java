package beanlifecycle.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/**
 * 
 * The BeanPostProcessor interface defines callback methods that you can
 * implement to provide your own instantiation logic, dependency-resolution logic,
 * etc. You can also implement some custom logic after the Spring container
 * finishes instantiating, configuring, and initializing a bean by plugging in one 
 * or more BeanPostProcessor implementations.
 * 
 * The BeanPostProcessors operate on bean (or object) instances, which means that 
 * the Spring IoC container instantiates a bean instance and then BeanPostProcessor 
 * interfaces do their work.
 * 
 * An ApplicationContext automatically detects any beans that are defined with 
 * the implementation of the BeanPostProcessor interface and registers these beans
 * as postprocessors, to be then called appropriately by the container upon bean
 * creation.
 * 
 * @author yusri
 *
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {
	
	public CustomBeanPostProcessor() {}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("Bean %s inicializado okmente".toUpperCase(), beanName));
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("Inicializando bean %s".toUpperCase(), beanName));
		return bean;
	}

}
