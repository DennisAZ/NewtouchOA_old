package com.pointlion.sys.mvc.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOaResGet<M extends BaseOaResGet<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setGetUserId(java.lang.String getUserId) {
		set("get_user_id", getUserId);
	}

	public java.lang.String getGetUserId() {
		return get("get_user_id");
	}

	public void setGetUserName(java.lang.String getUserName) {
		set("get_user_name", getUserName);
	}

	public java.lang.String getGetUserName() {
		return get("get_user_name");
	}

	public void setResId(java.lang.String resId) {
		set("res_id", resId);
	}

	public java.lang.String getResId() {
		return get("res_id");
	}

	public void setResName(java.lang.String resName) {
		set("res_name", resName);
	}

	public java.lang.String getResName() {
		return get("res_name");
	}

	public void setGetSum(java.lang.String getSum) {
		set("get_sum", getSum);
	}

	public java.lang.String getGetSum() {
		return get("get_sum");
	}

	public void setGetTime(java.lang.String getTime) {
		set("get_time", getTime);
	}

	public java.lang.String getGetTime() {
		return get("get_time");
	}

	public void setBackTime(java.lang.String backTime) {
		set("back_time", backTime);
	}

	public java.lang.String getBackTime() {
		return get("back_time");
	}

	public void setDes(java.lang.String des) {
		set("des", des);
	}

	public java.lang.String getDes() {
		return get("des");
	}
	
	public void setIfSubmit(java.lang.String ifsubmit) {
		set("if_submit", ifsubmit);
	}

	public java.lang.String getIfSubmit() {
		return get("if_submit");
	}
	
	public void setIfComplete(java.lang.String ifagree) {
		set("if_complete", ifagree);
	}

	public java.lang.String getIfComplete() {
		return get("if_complete");
	}
	
	public void setIfAgree(java.lang.String ifagree) {
		set("if_agree", ifagree);
	}

	public java.lang.String getIfAgree() {
		return get("if_agree");
	}
	
	public void setProcInsId(java.lang.String o) {
		set("proc_ins_id", o);
	}

	public java.lang.String getProcInsId() {
		return get("proc_ins_id");
	}
}
