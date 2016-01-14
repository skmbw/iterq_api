package com.vteba.iterq.api.question.service.spi;

import java.util.List;

import com.vteba.iterq.api.question.model.Question;
import com.vteba.iterq.api.question.model.QuestionBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 问题相关的业务service接口。
 * @author yinlei
 * @date 2015-9-29 16:38:33
 */
public interface QuestionService extends MyBatisService<Question, QuestionBean, String> {
	public List<Question> updateList(List<Question> quesList);
	
	public int deleteList();
	
	public List<Question> queryList();
}
