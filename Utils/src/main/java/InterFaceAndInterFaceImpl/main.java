package InterFaceAndInterFaceImpl;

import InterFaceAndInterFaceImpl.pojo.UserInfo;
import InterFaceAndInterFaceImpl.service.IUserManager;
import InterFaceAndInterFaceImpl.service.Impl.NewUserManagerImpl;
import InterFaceAndInterFaceImpl.service.Impl.UserManagerImpl;

/**
 * @auther gxnualbert
 * @create 2019-09-10-18:33
 */

/*
* 这里的这个例子，主要是为了说明白面向接口编程的好处
*
* */
public class main {
    public static void main(String[] args) throws Exception {
        UserInfo userInfo=new UserInfo();
        userInfo.setAge(13);
        userInfo.setSex("男");
        userInfo.setUserName("李广");

        IUserManager iUserManager = new UserManagerImpl();
        System.out.println(iUserManager.addUserInfo(userInfo));

        IUserManager iUserManager1 =new NewUserManagerImpl();
        System.out.println(iUserManager1.addUserInfo(userInfo));

    }
}
