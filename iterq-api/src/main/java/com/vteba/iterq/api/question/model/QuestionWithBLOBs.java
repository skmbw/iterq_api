package com.vteba.iterq.api.question.model;

public class QuestionWithBLOBs extends Question {
    /**
     * 对应数据库表字段 question.ask
     */
    private String ask;

    /**
     * 对应数据库表字段 question.answer
     */
    private String answer;

    /**
     * 获得字段 question.ask 的值
     *
     * @return the value of question.ask
     */
    public String getAsk() {
        return ask;
    }

    /**
     * 设置字段 question.ask 的值
     *
     * @param ask the value for question.ask
     */
    public void setAsk(String ask) {
        this.ask = ask;
    }

    /**
     * 获得字段 question.answer 的值
     *
     * @return the value of question.answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置字段 question.answer 的值
     *
     * @param answer the value for question.answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}