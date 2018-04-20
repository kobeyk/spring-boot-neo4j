package com.appleyk.result;



public enum ResponseMessage {

	/**
	 * 成功
	 */
	OK(200,"成功"),
	
	/**
	 * 成功
	 */
	NOCHANGE(200,"未做任何修改"),
	
	/**
	 * 错误的请求
	 */
	BAD_REQUEST(400,"错误的请求"),
	
	/**
	 * 错误的请求
	 */
	NOTNULL_ID(400,"请求ID不能为空"),
	
	/**
	 * 错误的请求
	 */
	NOTNULL_NAME(400,"名称不能为空"),
	
	/**
	 * 未授权——未授权客户机访问数据
	 */
	UNAUTHORIZED(401,"未授权——未授权客户机访问数据"),
	
	/**
	 * 需要付款——表示计费系统已有效
	 */
	PAYMENT_REQUIRED(402,"需要付款——表示计费系统已有效"),
	
	/**
	 * 禁止——即使有授权也不需要访问
	 */
	FORBIDDEN(403,"禁止——即使有授权也不需要访问"),
	
	/**
	 * 正在使用，无法删除
	 */
	UNDELETE(403,"无法删除"),
	
	UNDELETE_NOTMINE(403,"无法删除——非本人创建"),
	
	/**
	 * 找不到——服务器找不到给定的资源；文档不存在
	 */
	NOT_FOUND(404,"找不到——服务器找不到给定的资源；文档不存在"),
	
	/**
	 * 无法接受——不合法的请求数据
	 */
	UN_ACCEPT(406,"无法接受——不合法的请求数据"),
	
	/**
	 * 无法接受——不合法的请求数据
	 */
	IDS_UNACCEPT(406,"ids参数值不合法"),
	
	/**
	 * 代理认证请求 — 客户机首先必须使用代理认证自身
	 */
	PROXY_AUTHENTICATION_REQUIRED(407,"代理认证请求 — 客户机首先必须使用代理认证自身"),
	
	/**
	 * 介质类型不受支持 — 服务器拒绝服务请求，因为不支持请求实体的格式
	 */
	UNSUPPORTED_MEDIA_TYPE(415,"介质类型不受支持 — 服务器拒绝服务请求，因为不支持请求实体的格式"),
	
	/**
	 * 内部错误
	 */
	INTERNAL_SERVER_ERROR(500, "内部错误"),
	
	/**
	 * 还未实现
	 */
	NOT_IMPLEMENTED(501, "还未实现"),
	
	/**
	 * 网关错误
	 */
	BAD_GATEWAY(502, "网关错误"),
	
	/**
	 * 版本号重复
	 */
	VERSION_NAME_REPETITION(503, "版本号重复"),
	
	/**
	 * 找不到数据
	 */
	DATA_NOT_FOUND(504, "找不到数据"),
	
	/**
	 * 信息不完整
	 */
	INCOMPLETE_INFORMATION(505, "信息不完整"),
	
	/**
	 * 参数错误
	 */
	PARAMETER_ERROR(506, "参数错误"),
	
	/**
	 * 版本信息不完整
	 */
	VERSION_INCOMPLETE_INFORMATION(507, "版本信息不完整"),
	
	/**
	 * 基本信息不完整
	 */
	BASE_INCOMPLETE_INFORMATION(508, "基本信息不完整"),
	
	/**
	 * 英文名称重复
	 */
	E_NAME_REPETITION(509, "英文名称重复"),
	
	/**
	 * 中文名称重复
	 */
	C_NAME_REPETITION(510, "名称重复"),
	
	/**
	 * 关系已存在
	 */
	RELATION_EXIST(510, "关系已存在"),
	
	/**
	 * 文件夹名称重复
	 */
	FOLDER_NAME_REPETITION(511, "文件夹名称重复"),
	
	/**
	 * 文件夹名称重复
	 */
	DOCUMENT_NAME_REPETITION(512, "文档标题重复"),
	
	/**
	 * 首页类别名称重复
	 */
	CATEGORY_NAME_REPETITION(513, "首页类别名称重复"),
	
	/**
	 * 首页内容名称重复
	 */
	CONTENT_NAME_REPETITION(514, "首页内容名称重复"),
	
	/**
	 * 操作太頻繁！
	 */
	FREQUENT_FEEDBACK(515, "操作太频繁，请五分钟后再提交！"),
	
	/**
	 * 服务范围格式异常！
	 */
	RANGE_ERROR_FORMAT (516, "服务范围格式异常！"),
	;
	
	private final int status;
	
	private final String message;
	
	ResponseMessage(int status, String message){
		this.status = status;
		this.message = message;
	}
	
	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}
	
}
