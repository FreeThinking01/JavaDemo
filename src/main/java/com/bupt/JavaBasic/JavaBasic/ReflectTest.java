package com.bupt.JavaBasic.JavaBasic;



import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: JavaDemo
 * @author: FreeThinking
 * @create: 2022-03-07 22:21
 * @description: 反射测试
 **/
public class ReflectTest {

    static class Worker {
        private Integer a = null;
        private Integer b = null;

        public void setA(Integer a) {
            this.a = a;
        }

        public Integer getA() {
            return a;
        }

        public void setB(Integer b) {
            this.b = b;
        }

        public Integer getB() {
            return b;
        }
    }

    static class transferWorker extends Worker {
        int c = 1;
    }

    public static void main(String[] args) {
        //两个对象，一个对象的实例数据已经被填充，反射复制
        Worker test1 = new Worker();
        Worker test2 = new Worker();
        test1.setA(1);
        test1.setB(2);

        //获取被拷贝对象的CLass
        Class<Worker> aClazz = (Class<Worker>) test1.getClass();
        Class<Worker> bClazz = (Class<Worker>) test2.getClass();
        //遍历所有字段赋值 注意用getDeclaredFields()获取所有字段而不是getFields()获取public字段
        for (Field field : aClazz.getDeclaredFields()) {
            try {
                //1. 方法一 拼接字符串获取方法
                Method method1 = aClazz.getMethod("get" + field.getName().toUpperCase());
                Method method2 = bClazz.getMethod("set" + field.getName().toUpperCase(),field.getType());
                method2.invoke(test2, method1.invoke(test1));

                //2. 方法二 获取属性值
//                field.set(test2, field.get(test1));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(test2.getA());
        System.out.println(test2.getB());


        //子类对象拿到父类class和private
        transferWorker worker = new transferWorker();
        Class<? extends transferWorker> workerClass = worker.getClass();
        Class<?> superclass = workerClass.getSuperclass();
        Field[] declaredFields = superclass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            System.out.println(declaredFields[i]);
        }

    }

}

