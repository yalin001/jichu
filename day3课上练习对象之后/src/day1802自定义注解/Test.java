package day1802�Զ���ע��;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*@Target
 * ����ע���ע��Ŀ�꣺�࣬��������Ա����������
 * 
 * @Retention
 * ������Ϣ�ı�����Χ��Դ�룬�ֽ��룬�������ڴ�
 */
////@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	int id() default 0;//�����ָ��Ĭ��ֵ��ʹ��ʱ�����븳ֵ
	String title() default "";
	/*
	 * �������������value
	 * �����������������ֵʱ�����Բ�дvalue
	 * ��������������������ʹ�ã�����������������һ������
	 * 
	 * value ���� title��һ������
	 * @Test("sdfsdfs")
     * @Test(id=5, value="dfgsdf")
     * @Test(id=5, title="dfgsdf")
	 */
	String value() default "";

}
