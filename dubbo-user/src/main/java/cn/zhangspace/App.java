package cn.zhangspace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("order-consumer.xml");

        //用户下单过程
        IOrderService services=(IOrderService)context.getBean("orderServices");

        DoOrderRequest request=new DoOrderRequest();
        request.setName("zhangsan");
        DoOrderResponse response=services.doOrder(request);

        System.out.println(response);

    }
}
