package design.pattern.principle.ocp.improve;

/**
 * @auther gxnualbert
 * @create 2019-10-09-20:09
 */
public class Ocp {
    public static void main(String[] args) {
        //使用ocp改进之后，如果想新增别的图像，只要新增一个类，然后继承shape，重写draw方法
        //最后，在调用graphicEditor的drawShape，传入一个相应的类即可
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
        graphicEditor.drawShape(new WuJiaoXing());
    }
}


//这是一个用于绘图的类 [使用方]
class GraphicEditor {
    //接收Shape对象，调用draw方法
    public void drawShape(Shape s) {
        s.draw();
    }


}

//Shape类，基类
abstract class Shape {
    int m_type;
    public abstract void draw();//抽象方法
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

//新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

//新增一个图形
class OtherGraphic extends Shape {
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制其它图形 ");
    }
}


class WuJiaoXing extends  Shape{
    WuJiaoXing(){
        super.m_type=5;
    }
    @Override
    public void draw() {
        System.out.println("绘制五角星");
    }
}