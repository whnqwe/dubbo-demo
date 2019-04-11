package cn.zhangspace;

public class OrderServiceImpl implements IOrderService {

    @Override
    public DoOrderResponse doOrder(DoOrderRequest doOrderRequest) {
        System.out.println(doOrderRequest);
        DoOrderResponse doOrderResponse = new DoOrderResponse();
        doOrderResponse.setCode("1000");
        doOrderResponse.setMemo("处理成功");
        return doOrderResponse;
    }
}
