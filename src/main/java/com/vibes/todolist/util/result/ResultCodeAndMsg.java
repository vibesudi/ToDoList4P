package com.vibes.todolist.util.result;

import lombok.Getter;
import lombok.Setter;

public enum ResultCodeAndMsg {

	/* 系统级别错误 */
	/** 执行出现异常 */
	ERROR501("501", null),

	/** 处理成功 */
	OK("1", "处理成功。"),
	/** 登录失效，请重新登录。 */
	ERR20001("20001", "您未登录或登录失效，请重新登录。"),
	/** 对不起，您没有访问权限。 */
	ERR20002("20002", "对不起，您没有访问权限。"),
	/** 对不起，您输入的用户名不存在。 */
	ERR20003("20003", "对不起，您输入的用户名不存在。"),
	/** 用户名或密码错误。 */
	ERR20004("20004", "用户名或密码错误。"),
	/** 对不起，您的账号已在其他地方登陆。 */
	ERR20005("20005", "对不起，您的账号已在其他地方登陆，请重新登录。"),
	/** 用户名不能为空。 */
	ERR20006("20006", "用户名不能为空。"),
	/** 密码不能为空。 */
	ERR20007("20007", "密码不能为空。"),
	/** 请用分片上传。 */
	ERR20008("20008", "请用分片上传。"),
	/** 新增或修改名称重复。 */
	ERR30001("30001", "新增或修改名称重复"),
	/** 产品未激活 */
	ERR90001("90001", "对不起，您的产品未激活。"),
	/* 业务错误code */
	/** 存在相同年级名称 */
	ERRA0005_REPEAT_NAME("A0005-repeat-name", "存在相同学年名称。"),
	/** 该学年下已经存在学期，请删除该学年下所有学期再删除该学年！ */
	ERRA0005_EXISTS_TERM("A0005-exists-term", "该学年下已经存在学期，请删除该学年下所有学期再删除该学年！"),
	/** 存在相同学期名称 */
	ERRA0006("A0006-repeat-name", "存在相同学期名称。"),
	/** 存在相同教师工号/移动电话 */
	ERRA0008("A0008-repeat-name", "存在相同教师工号/移动电话。"),
	/** 存在相同学期名称 */
	ERRA0009("A0009-repeat-name", "存在相同专业名称。"),
	/** 存在相同班级名称 */
	ERRA0011_REPEAT_NAME("A0011-repeat-name", "存在相同班级名称。"),
	/** 存在相同课程名称 */
	ERRA0012_REPEAT_NAME("A0012-repeat-name", "存在相同课程名称。");

	@Getter
	@Setter
	private String code;
	@Getter
	@Setter
	private String msg;

	private ResultCodeAndMsg(final String code, final String msg) {
		this.code = code;
		this.msg = msg;
	}
}
