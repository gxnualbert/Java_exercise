package InterFaceAndInterFaceImpl.service.Impl;

import InterFaceAndInterFaceImpl.pojo.UserInfo;
import InterFaceAndInterFaceImpl.service.IUserManager;

/**
 * @auther gxnualbert
 * @create 2019-09-10-18:38
 */
public class NewUserManagerImpl implements IUserManager {
    @Override
    public boolean addUserInfo(UserInfo userInfo) throws Exception {
        System.out.println("这是新的一个接口实现类，因为有新功能增加进来了！！！！");
        return false;
    }

    @Override
    public boolean delUserInfo(int id) throws Exception {
        return false;
    }

    @Override
    public boolean modifyUserInfo(UserInfo userInfo, int id) throws Exception {
        return false;
    }

    @Override
    public UserInfo queryUserbyId(int id) throws Exception {
        return null;
    }
}
