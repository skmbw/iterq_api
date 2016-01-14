package com.vteba.iterq.api.question.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.iterq.api.question.model.Question;
import com.vteba.iterq.api.question.service.spi.QuestionService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 问题控制器
 * @author yinlei
 * @date 2015-9-29 16:38:33
 */
@Controller
@RequestMapping("/question")
public class QuestionAction extends GenericAction<Question> {
	private static final Logger LOGGER = LoggerFactory.getLogger(QuestionAction.class);
	
	@Inject
	private QuestionService questionServiceImpl;
	
	/**
     * 获得问题List，初始化列表页。
     * @param model 参数
     * @return 问题List
     */
    @RequestMapping("/initial")
    public String initial(Question model, Map<String, Object> maps) {
    	try {
    		List<Question> list = questionServiceImpl.pagedList(model);
            maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "question/initial";
    }
	
	/**
	 * 获得问题List，Json格式。
	 * @param model 参数
	 * @return 问题List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<Question> list(Question model) {
		List<Question> list = null;
		try {
			list = questionServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}
	
	/**
     * 根据Id获得问题实体，Json格式。
     * @param id 参数id
     * @return 问题实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public Question get(String id) {
    	Question model = null;
    	try {
    		questionServiceImpl.get("22");
    		List<Question> list = questionServiceImpl.queryList();
    		for (Question q : list) {
    			System.out.println(q);
    		}
    		model = list.get(0);
		} catch (Exception e) {
			LOGGER.error("get record error, errorMsg=[{}].", e.getMessage());
		}
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "question/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(Question model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = questionServiceImpl.save(model);
            if (result == 1) {
                bean.setMessage(SUCCESS);
                bean.setCode(1);
                LOGGER.info("save record success.");
            } else {
                bean.setMessage(ERROR);
                LOGGER.error("save record error.");
            }
		} catch (Exception e) {
			LOGGER.error("save record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
    
    /**
     * 查看问题详情页。
     * @param model 查询参数，携带ID
     * @return 问题详情页
     */
    @RequestMapping("/detail")
    public String detail(Question model, Map<String, Object> maps) {
    	try {
    		model = questionServiceImpl.get(model.getId());
            maps.put("model", model);//将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "question/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(Question model, Map<String, Object> maps) {
        model = questionServiceImpl.get(model.getId());
        maps.put("model", model);
        return "question/edit";
    }
    
    /**
     * 更新问题信息
     * @param model 要更新的问题信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(Question model) {
    	JsonBean bean = new JsonBean();
    	try {questionServiceImpl.updateList(null);
    		int result = 1;//questionServiceImpl.updateById(model);
            if (result == 1) {
                bean.setMessage(SUCCESS);
                bean.setCode(1);
                LOGGER.info("update record success.");
            } else {
                bean.setMessage(ERROR);
                LOGGER.error("update record error.");
            }
		} catch (Exception e) {
			LOGGER.error("update record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
    
    /**
     * 删除问题信息
     * @param id 要删除的问题ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
    	JsonBean bean = new JsonBean();
    	try {
    		questionServiceImpl.deleteList();
    		int result = 1;//questionServiceImpl.deleteById(id);
    		if (result == 1) {
    			bean.setMessage(SUCCESS);
    			bean.setCode(1);
    			LOGGER.info("delete record success, id=[{}].", id);
    		} else {
    			bean.setMessage(ERROR);
    			LOGGER.error("delete record error.");
    		}
		} catch (Exception e) {
			LOGGER.error("delete record error, id=[{}], errorMsg=[{}].", id, e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
}
