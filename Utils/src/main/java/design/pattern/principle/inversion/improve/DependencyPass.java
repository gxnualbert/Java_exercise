package design.pattern.principle.inversion.improve;

/**
 * @auther gxnualbert
 * @create 2019-10-09-16:40
 */
public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        //1通过接口传递实现依赖
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);

        //2通过构造器进行依赖传递
//		OpenAndClose openAndClose = new OpenAndClose(changHong);
//		openAndClose.open();


        //3通过setter方法进行依赖传递
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.setTv(changHong);
//        openAndClose.open();
    }
}






//start  方式1： 通过接口传递实现依赖
// 开关的接口
interface IOpenAndClose {
    void open(ITV tv); //抽象方法,接收接口
}

interface ITV { //ITV接口
    void play();
}

// 实现接口
class OpenAndClose implements IOpenAndClose {
    public void open(ITV tv) {
        tv.play();
    }
}
//end  方式1： 通过接口传递实现依赖


//// start 方式2: 通过构造方法依赖传递
// interface IOpenAndClose {
// void open(); //抽象方法
// }
// interface ITV { //ITV接口
//  void play();
// }
// class OpenAndClose implements IOpenAndClose{
// public ITV tv; //成员
// public OpenAndClose(ITV tv){ //构造器
// this.tv = tv;
// }
// public void open(){
// this.tv.play();
// }
// }
//// end 方式2: 通过构造方法依赖传递


//// start  方式3 , 通过setter方法传递
//interface IOpenAndClose {
//    void open(); // 抽象方法
//    void setTv(ITV tv);
//}
//
//interface ITV { // ITV接口
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    private ITV tv;
//    public void setTv(ITV tv) {
//        this.tv = tv;
//    }
//    public void open() {
//        this.tv.play();
//    }
//}
//
//// end  方式3 , 通过setter方法传递

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }

}