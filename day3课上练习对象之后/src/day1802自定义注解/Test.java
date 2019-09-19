package day1802自定义注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*@Target
 * 设置注解的注解目标：类，方法，成员变量，参数
 * 
 * @Retention
 * 设置信息的保留范围：源码，字节码，运行期内存
 */
////@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	int id() default 0;//如果不指定默认值，使用时，必须赋值
	String title() default "";
	/*
	 * 特殊的属性名：value
	 * 有特殊待遇，单独赋值时，可以不写value
	 * 经常和其他属性名配置使用，当做其他属性名的一个别名
	 * 
	 * value 当做 title的一个别名
	 * @Test("sdfsdfs")
     * @Test(id=5, value="dfgsdf")
     * @Test(id=5, title="dfgsdf")
	 */
	String value() default "";

}
