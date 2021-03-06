package com.fasheng.service.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasheng.service.dao.UserDAO;
import com.fasheng.service.dto.UserDTO;
import com.fasheng.service.helper.UserHelper;
import com.fasheng.service.model.UserDO;
import com.fasheng.service.service.interfaces.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    
    @Autowired
    private UserDAO             userDAO;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDAO.deleteByPrimaryKey(id);
    }

    @Override
    public UserDTO insert(UserDTO userDTO) {
        if(StringUtils.isBlank(userDTO.getUserId())) {
            userDTO.setUserId(String.valueOf(userDAO.selectNextUserId()));
        }
        UserDO userDO = UserHelper.convert2UserDO(userDTO);
        logger.info("Insert UserDO:{} success!", userDO);
        int flag = userDAO.insert(userDO);
        if(flag > 0) {
            return userDTO;
        } else {
            return null;
        }
    }

    @Override
    public UserDTO selectByPrimaryKey(Integer id) {
        UserDO userDO = userDAO.selectByPrimaryKey(id);
        return UserHelper.convert2UserDTO(userDO);
    }

    @Override
    public int updateByPrimaryKey(UserDTO userDTO) {
        UserDO userDO = UserHelper.convert2UserDO(userDTO);
        return userDAO.updateByPrimaryKey(userDO);
    }

    @Override
    public int getCurrentUserId() {
        return userDAO.selectCurrentUserId();
    }

    @Override
    public int getNextUserId() {
        return userDAO.selectNextUserId();
    }

}
