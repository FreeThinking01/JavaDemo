package com.bupt.Parklot;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-21 16:12
 * @description:
 *
 * 某停车场(Parklot)有停车位(ParkingSpace)若干,并且有一个入口和出口,入口完成扫描计时,
 * 出口完成结账并且释放车位,停车位分常规停车位和合约停车位，常规停车位包含了两类:货车位和小车位，
 * 货车按每小时10元计价，每天最高累计120元,小车位按每小时5元计价，每天最高累计60元，合约停车位每月收费150元。
 * 试编程为该停车场设计一个车位安排和计算日收入的简易程序。
 *
 **/
public class ParkLot {

    //MAX 最大可用
    int goodsCar;
    int smallCar;
    int conCar;

    HashMap<Integer, Car> goodsList = new HashMap<>();
    HashMap<Integer, Car> smallList = new HashMap<>();
    HashMap<Integer, Car> conList = new HashMap<>();

    HashMap<Integer, Integer> profitMap = new HashMap<>();


    public ParkLot(int goodsCar, int smallCar, int conCar) {//输入参数三种车位数量
        this.goodsCar = goodsCar;
        this.smallCar = smallCar;
        this.conCar = conCar;
    }

    public synchronized void enterParkLot(String carType, int carNumber) throws InterruptedException {
        Car car = new Car(carNumber, carType);
        if(carType.equals("smallCar")){
            while (smallList.size() == smallCar){
                System.out.println("排队进入");
                this.wait();
            }
            smallList.put(carNumber, car);
        }else if(carType.equals("goodsCar")){
            while (goodsList.size() == goodsCar){
                System.out.println("排队进入");
                this.wait();
            }
            goodsList.put(carNumber, car);
        }else {
            while (conList.size() == conCar){
                System.out.println("排队进入");
                this.wait();
            }
            conList.put(carNumber, car);
        }
        this.notifyAll();
    }

    public synchronized void OutParkLot(String carType, int carNumber) throws InterruptedException {
        Car curCar = null;
        if(carType.equals("smallCar")){
            if (smallList.size() == 0){
                System.out.println("该类型车位无车");
                return;
//                this.wait();
            }
            curCar = smallList.get(carNumber);
            smallList.remove(curCar);
        }else if(carType.equals("goodsCar")){
            if (goodsList.size() == 0){
                System.out.println("该类型车位无车");
                return;
//                this.wait();
            }
            curCar = goodsList.get(carNumber);
            goodsList.remove(carNumber);

        }else {
            if (conList.size() == 0){
                System.out.println("该类型车位无车");
                return;
//                this.wait();
            }
            curCar = conList.get(carNumber);
            conList.remove(carNumber);
        }
        int profit = 0;
        int day = Calendar.getInstance().get(Calendar.DAY_OF_YEAR) - curCar.beginTime.get(Calendar.DAY_OF_YEAR);
        profit += (day - 1) * curCar.price * 12;
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY) - curCar.beginTime.get(Calendar.HOUR_OF_DAY);
        profit += hour > 12 ? curCar.price * 12 : curCar.price * hour;
        this.profitMap.put(Calendar.getInstance().get(Calendar.DAY_OF_YEAR), profit);
        this.notifyAll();

    }

    public int getProfit(int day){
        return this.profitMap.get(day);
    }

    class Car{

        int carNumber;
        int price;
        Calendar beginTime;
        String carType;

        public Car(int carNumber, String carType) {
            this.carNumber = carNumber;
            this.carType = carType;
            if(carType.equals("smallCar")){
                this.price = 5;
            }else if(carType.equals("goodsCar")){
                this.price = 10;
            }
            beginTime = Calendar.getInstance();
        }

    }

    public static void main(String[] args) {

        ParkLot parkLot = new ParkLot(5, 5, 5);

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 6; i++) {
                try {
                    parkLot.enterParkLot("goodsCar", i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 6; i++) {
                try {
                    parkLot.enterParkLot("smallCar", i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(()->{
            for (int i = 0; i < 6; i++) {
                try {
                    parkLot.enterParkLot("conCar", i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread4 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 6; i++) {
                try {
                    parkLot.OutParkLot("goodsCar", i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();

        thread4.start();
//        parkLot.getProfit(33);
    }

}




























