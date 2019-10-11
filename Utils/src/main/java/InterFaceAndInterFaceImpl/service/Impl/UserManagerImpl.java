package InterFaceAndInterFaceImpl.service.Impl;

import InterFaceAndInterFaceImpl.pojo.UserInfo;
import InterFaceAndInterFaceImpl.service.IUserManager;

/**
 * @auther gxnualbert
 * @create 2019-09-10-18:28
 */
public class UserManagerImpl  implements IUserManager {

    @Override
    public boolean addUserInfo(UserInfo userInfo) throws Exception {
        System.out.println("=========这个是UserManagerImpl实现类中的addUserInfo()方法=========");
        return false;
    }

    @Override
    public boolean delUserInfo(int id) throws Exception {
        System.out.println("=========这个是UserManagerImpl实现类中的delUserInfo()方法=========");
        return false;
    }

    @Override
    public boolean modifyUserInfo(UserInfo userInfo, int id) throws Exception {
        System.out.println("=========这个是UserManagerImpl实现类中的modifyUserInfo()方法=========");
        return false;

    }

    @Override
    public UserInfo queryUserbyId(int id) throws Exception {
        System.out.println("=========这个是UserManagerImpl实现类中的queryUserbyId()方法=========");
        return null;
    }
}
