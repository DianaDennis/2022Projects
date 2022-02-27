package main.java.com.qa.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.ITestNGListener;
import org.testng.annotations.ITestAnnotation;

public interface IAnnotationTransformer extends ITestNGListener{

	          //IAnnotationTransformer
	
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod);
}
