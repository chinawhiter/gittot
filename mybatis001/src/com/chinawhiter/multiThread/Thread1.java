package com.chinawhiter.multiThread;

public class Thread1 implements Runnable{
	public Thread1(int taskId, String taskName) {
		this.taskId = taskId;
		this.taskName = taskName;
	}

	private int taskId;
	private String taskName;
	
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		System.out.println("taskId = "+taskId+",taskName = "+taskName);
	}

}
