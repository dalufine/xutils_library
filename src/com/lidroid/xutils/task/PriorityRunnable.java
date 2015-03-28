package com.lidroid.xutils.task;

/**
 * 给Runnable加上优先级
 * Author: wyouflf
 * Date: 14-5-16
 * Time: 上午11:25
 */
public class PriorityRunnable extends PriorityObject<Runnable> implements Runnable {
	/**
	 * 给Runnable加上优先级
	 * @param priority
	 * @param obj
	 */
    public PriorityRunnable(Priority priority, Runnable obj) {
        super(priority, obj);
    }

    @Override
    public void run() {
        this.obj.run();
    }
}
