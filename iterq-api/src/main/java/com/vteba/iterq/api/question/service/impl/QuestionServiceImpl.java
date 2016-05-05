package com.vteba.iterq.api.question.service.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.google.common.collect.Lists;
import com.vteba.iterq.api.question.dao.QuestionDao;
import com.vteba.iterq.api.question.model.Question;
import com.vteba.iterq.api.question.model.QuestionBean;
import com.vteba.iterq.api.question.service.spi.QuestionService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.vteba.utils.id.ObjectId;

/**
 * 问题相关的service业务实现。
 * @author yinlei
 * @date 2015-9-29 16:38:33
 */
@Named
public class QuestionServiceImpl extends MyBatisServiceImpl<Question, QuestionBean, String> implements QuestionService {
	// 添加了方法后，记得改为private
	protected QuestionDao questionDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Question, QuestionBean, String> questionDao) {
		this.baseDao = questionDao;
		this.questionDao = (QuestionDao) questionDao;
	}
	
	@CachePut(value = "question", key = "'list'")
	public List<Question> updateList(List<Question> quesList) {
		List<Question> list = Lists.newArrayList();
		Question q = new Question();
		q.setAnswerId(ObjectId.get().toString());
		q.setId(ObjectId.get().toString());
		q.setCloseTime(new Date());
		q.setUserName("haoa");
		list.add(q);
		return list;
	}
	
	@CacheEvict(value = "question", key = "'list'")
	public int deleteList() {
		// 这个只是触发删除缓存的操作，当没有业务时，可以直接空方法体
		// 如果需要也可以在这个方法中执行
		return 1;
	}
	
	//@Prefix("list")
	@Cacheable(value = "question", key="'list'")//keyGenerator = "redisKeyGenerator")
	public List<Question> queryList() {
//		List<Question> list = Lists.newArrayList();
//		Question q = new Question();
//		q.setAnswerId(ObjectId.get().toHexString());
//		q.setId(ObjectId.get().toHexString());
//		q.setCloseTime(new Date());
//		q.setUserName("yinlei");
//		list.add(q);
		return queryList2();
	}
	
	//@Prefix("list")
	@Cacheable(value = "question", key="'list'")//keyGenerator = "redisKeyGenerator")
	public List<Question> queryList2() {
//		AnnotationCacheAspect aspect = ApplicationContextHolder.getBean(CacheManagementConfigUtils.CACHE_ASPECT_BEAN_NAME);
//		System.out.println(aspect);
		List<Question> list = Lists.newArrayList();
		Question q = new Question();
		q.setAnswerId(ObjectId.get().toString());
		q.setId(ObjectId.get().toString());
		q.setCloseTime(new Date());
		q.setUserName("yinlei");
		list.add(q);
		return list;
	}
}
