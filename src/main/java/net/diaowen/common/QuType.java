package net.diaowen.common;

/**
 * QuType
 * @author keyuan(keyuan258@gmail.com)
 *一个枚举类，包含了各种题目类型
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public enum QuType {

	YESNO("是非题","yesno", 0),
	RADIO("单选题","radio", 1),
	CHECKBOX("多选题","checkbox", 2),
	FILLBLANK("填空题","fillblank", 3),

	COMPRADIO("复合单选","comp-radio", 17),
	COMPCHECKBOX("复合多选","comp-checkbox", 18),

	MULTIFILLBLANK("多项填空题","multi-fillblank", 4),//组合填空题
	ANSWER("多行填空题","answer", 5),//原问答题
	BIGQU("大题","bigqu", 6),

	ENUMQU("枚举题","enumqu", 7),
	SCORE("评分题","score", 8),
	ORDERQU("排序题","orderby", 9),
	CHENRADIO("矩阵单选题","chen-radio", 11),
	CHENFBK("矩阵填空题","chen-fbk", 12),
	CHENCHECKBOX("矩阵多选题","chen-checkbox", 13),
	COMPCHENRADIO("复合矩阵单选题","comp-chen-radio", 14),

	UPLOADFILE("文件上传题","sendfile",15),
	PAGETAG("分页标记","pagetag",16),
	PARAGRAPH("段落说明","paragraph",17),
	CHENSCORE("矩阵评分题","chen-score", 18);



	private String cnName;
	private String actionName;
	private int index;

	/**
	 * 构造函数
	 *
	 * @param cnName 名称
	 * @param actionName 操作名称
	 * @param index 索引
	 */
	QuType(String cnName,String actionName,int index){
		this.cnName=cnName;
		this.actionName=actionName;
		this.index=index;
	}
	/**
	 * 获取名称
	 *
	 * @return 名称
	 */
	public String getCnName() {
		return cnName;
	}
	/**
	 * 设置名称
	 *
	 * @param cnName 名称
	 */
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	/**
	 * 获取操作名称
	 *
	 * @return 操作名称
	 */
	public String getActionName() {
		return actionName;
	}
	/**
	 * 设置操作名称
	 *
	 * @param actionName 操作名称
	 */
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	/**
	 * 获取索引
	 *
	 * @return 索引
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * 设置索引
	 *
	 * @param index 索引
	 */
	public void setIndex(int index) {
		this.index = index;
	}

}
