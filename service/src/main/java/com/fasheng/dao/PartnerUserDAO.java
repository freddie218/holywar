package com.fasheng.dao;

import com.fasheng.model.PartnerUserDO;

public interface PartnerUserDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_user
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_user
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    int insert(PartnerUserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_user
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    PartnerUserDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table partner_user
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    int updateByPrimaryKey(PartnerUserDO record);
}