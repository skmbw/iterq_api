package com.vteba.iterq.api.question.dao;

import com.vteba.iterq.api.question.model.Question;
import com.vteba.iterq.api.question.model.QuestionBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 表question的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-09-29 16:38:35
 */
@DaoMapper
public interface QuestionDao extends BaseDao<Question, QuestionBean, String> {
}