package springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor implements BeanPostProcessor,Ordered{

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("Processing bean instance2 after initialization just after init cycle"+arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("Processing bean instance2 before initialization just after init cycle"+arg1);
		return arg0;
	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	
	

}
