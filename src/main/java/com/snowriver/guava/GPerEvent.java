package com.snowriver.guava;

import com.google.common.eventbus.EventBus;

public class GPerEvent {
    private String name = "GPer 生态圈";
    private static GPerEvent gper = null;

    private GPerEvent() {
    }

    public static GPerEvent getInstance() {
        if (null == gper) {
            gper = new GPerEvent();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。 ");
        EventBus eventBus = new EventBus();
        eventBus.register(new Teacher("江雪"));
        eventBus.post(question);
    }

}