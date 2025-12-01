//订单状态
public enum EnumDemo {
    //枚举常量对象列表
    //每一个枚举常量都是 EnumDemo 类型的实例对象，都会调用枚举类的构造方法，初始化 orderCode 和 orderDesc 这两个成员变量，所以每个枚举常量都要改写一下，给构造方法传递两个参数
    UNPAID(1,"未付款"),//未付款
    PAID(2,"已付款"),//已付款
    CHCKED(3,"已确认"),//确认订单
    DELIVERED(4,"已发货"),//已发货
    FINISHED(5,"订单已完成");//已完成

    //成员变量
    private int orderCode;//订单状态码
    private String orderDesc;//订单状态描述

    //getter、setter方法
    public int getOrderCode() {
        return orderCode;
    }
    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }
    public String getOrderDesc() {
        return orderDesc;
    }
    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    //构造方法
    //枚举类的构造方法是私有的，即使我们没有写 private 访问修饰符，它也是私有的 ==> 枚举类不允许外部创建对象（私有的构造方法在类的外部不允许调用）
    EnumDemo(int orderCode, String orderDesc) {
        this.orderCode = orderCode;
        this.orderDesc = orderDesc;
    }

    //成员方法
    @Override
    public String toString() {
        return "EnumDemo{" +
                "orderCode=" + orderCode +
                ", orderDesc='" + orderDesc + '\'' +
                '}';
    }
}
