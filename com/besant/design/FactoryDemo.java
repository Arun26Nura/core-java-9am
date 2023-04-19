package com.besant.design;

interface Mobile{
    String returnOs();
}

class Android implements Mobile{

    @Override
    public String returnOs() {
        return "Android";
    }
}
class IPhone implements Mobile{

    @Override
    public String returnOs() {
        return "IPhone";
    }
}

interface Mobilefactory{
    Mobile returnObj(String type);
}
class MobileFactoryimpl implements Mobilefactory{


    @Override
    public Mobile returnObj(String type) {
       if(type.equals("ios"))
           return new IPhone();
       else
           return new Android();
    }
}
public class FactoryDemo {
    public static void main(String[] args) {
      Mobilefactory mobilefactory=new MobileFactoryimpl();
    }
}
