package InterFaceAndInterFaceImpl.service;

import InterFaceAndInterFaceImpl.pojo.UserInfo;

/**
 * @auther gxnualbert
 * @create 2019-09-10-18:26
 */
public interface IUserManager {
    public boolean addUserInfo(UserInfo userInfo) throws Exception;

    public boolean delUserInfo(int id) throws Exception;

    public boolean modifyUserInfo(UserInfo userInfo, int id) throws Exception;

    public UserInfo queryUserbyId(int id) throws Exception;

}
