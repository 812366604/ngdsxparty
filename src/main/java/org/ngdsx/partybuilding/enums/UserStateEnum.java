package org.ngdsx.partybuilding.enums;

public enum UserStateEnum {

	OFFLINE(-1, "非法区域"), SUCCESS(0, "操作成功"), INNER_ERROR(-1001, "操作失败"), EMPTY(-1002, "信息为空");
	private int state;

	private String stateInfo;

	private UserStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static UserStateEnum stateOf(int index) {
		for (UserStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
