package com.imooc.assembly.mylist;

public class Parking implements Comparable<Parking>{
    //成员变量
    private String parkingNumber;//车位编号
    private String carNumber;//车牌号

    //getter、setter方法
    public String getParkingNumber() {
        return parkingNumber;
    }
    public void setParkingNumber(String parkingNumber) {
        this.parkingNumber = parkingNumber;
    }
    public String getCarNumber() {
        return carNumber;
    }
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    //方法实现
    @Override
    public int compareTo(Parking o) {
        //按照车位编号排序
        int result = this.parkingNumber.compareTo(o.getParkingNumber());
        return result;
    }

    //构造方法
    public Parking() {
    }
    public Parking(String parkingNumber, String carNumber) {
        this.parkingNumber = parkingNumber;
        this.carNumber = carNumber;
    }

    //成员方法
    @Override
    public String toString() {
        return "com.imooc.assembly.mylist.Parking{" +
                "parkingNumber='" + parkingNumber + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
