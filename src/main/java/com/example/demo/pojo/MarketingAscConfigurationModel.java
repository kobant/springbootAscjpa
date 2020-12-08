package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Date;


/**
 * @Description: 活动内容创建
 * @Author: liaocongcong
 * @Date: 2020/10/26 14:34
 */

@Entity
@Table(name = "marketing_asc_configuration")
public class MarketingAscConfigurationModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "activity_config_no", columnDefinition ="varchar(32) DEFAULT NULL COMMENT '活动配置编码'")
	private String activityConfigNo;

	@Column(name = "activity_name", columnDefinition = "varchar(100) DEFAULT NULL COMMENT '活动名称'")
	private String activityName;

	@Column(name = "activity_type", columnDefinition = "varchar(2) DEFAULT NULL COMMENT '活动类型'")
	private String activityType;

	@Column(name = "share_title", columnDefinition = "varchar(100) DEFAULT NULL COMMENT '分享标题'")
	private String shareTitle;

	@Column(name = "share_description", columnDefinition = "text DEFAULT NULL COMMENT '分享描述'")
	private String shareDescription;

	@Column(name = "start_time", columnDefinition = "datetime DEFAULT NULL COMMENT '开始时间'")
	private Date startTime;

	@Column(name = "end_time", columnDefinition = "datetime DEFAULT NULL COMMENT '结束时间'")
	private Date endTime;

	@Column(name = "asc_limit", columnDefinition = "int(11) DEFAULT 0 COMMENT '助力限制 1 一个人只能帮一个好友助力 2 一个人可以为多个好友助力'")
	private Integer ascLimit;

	@Column(name = "minimum_number", columnDefinition = "int(11) DEFAULT 0 COMMENT '助力门槛人数'")
	private Integer minimumNumber;

	@Column(name = "narrow_image", columnDefinition = "text DEFAULT NULL COMMENT '缩略图 多个用逗号隔开'")
	private String narrowImage;

	@Column(name = "present_image", columnDefinition = "text DEFAULT NULL COMMENT '活动内容介绍图 多个用逗号隔开'")
	private String presentImage;

	@Column(name = "progress_image", columnDefinition = "text DEFAULT NULL COMMENT '助力进度图 多个用逗号隔开'")
	private String progressImage;

	@Column(name = "raiders_image", columnDefinition = "text DEFAULT NULL COMMENT '攻略图 多个用逗号隔开'")
	private String raidersImage;

	@Column(name = "share_image", columnDefinition = "text DEFAULT NULL COMMENT '分享图 多个用逗号隔开'")
	private String shareImage;

	@Column(name = "activity_router_url", columnDefinition = "varchar(200) DEFAULT NULL COMMENT '活动地址'")
	private String activityRouterUrl;

	@Column(name = "business_date", columnDefinition = "datetime DEFAULT NULL COMMENT '业务日期'")
	private Date businessDate;

	@Column(name = "userId", columnDefinition = "varchar(32) DEFAULT NULL COMMENT '创建人'")
	private String userId;

	@Column(name = "rule", columnDefinition = "text DEFAULT NULL COMMENT '活动规则'")
	private String rule;

	@Column(name = "use_status", columnDefinition = "int(1) DEFAULT 1 COMMENT '伪删除 1:使用, 0:逻辑删除'",insertable = false)
	private Integer useStatus;

	@Column(name = "source", columnDefinition = "varchar(2) DEFAULT NULL COMMENT '1 520活动 2 618活动'")
	private String source;

	@Column(name = "create_time", columnDefinition = "datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'",insertable = false)
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivityConfigNo() {
		return activityConfigNo;
	}

	public void setActivityConfigNo(String activityConfigNo) {
		this.activityConfigNo = activityConfigNo;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getShareDescription() {
		return shareDescription;
	}

	public void setShareDescription(String shareDescription) {
		this.shareDescription = shareDescription;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getAscLimit() {
		return ascLimit;
	}

	public void setAscLimit(Integer ascLimit) {
		this.ascLimit = ascLimit;
	}

	public Integer getMinimumNumber() {
		return minimumNumber;
	}

	public void setMinimumNumber(Integer minimumNumber) {
		this.minimumNumber = minimumNumber;
	}

	public String getNarrowImage() {
		return narrowImage;
	}

	public void setNarrowImage(String narrowImage) {
		this.narrowImage = narrowImage;
	}

	public String getPresentImage() {
		return presentImage;
	}

	public void setPresentImage(String presentImage) {
		this.presentImage = presentImage;
	}

	public String getProgressImage() {
		return progressImage;
	}

	public void setProgressImage(String progressImage) {
		this.progressImage = progressImage;
	}

	public String getRaidersImage() {
		return raidersImage;
	}

	public void setRaidersImage(String raidersImage) {
		this.raidersImage = raidersImage;
	}

	public String getShareImage() {
		return shareImage;
	}

	public void setShareImage(String shareImage) {
		this.shareImage = shareImage;
	}

	public String getActivityRouterUrl() {
		return activityRouterUrl;
	}

	public void setActivityRouterUrl(String activityRouterUrl) {
		this.activityRouterUrl = activityRouterUrl;
	}

	public Date getBusinessDate() {
		return businessDate;
	}

	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public Integer getUseStatus() {
		return useStatus;
	}

	public void setUseStatus(Integer useStatus) {
		this.useStatus = useStatus;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "MarketingAscConfigurationModel{" +
				"id=" + id +
				", activityConfigNo='" + activityConfigNo + '\'' +
				", activityName='" + activityName + '\'' +
				", activityType='" + activityType + '\'' +
				", shareTitle='" + shareTitle + '\'' +
				", shareDescription='" + shareDescription + '\'' +
				", startTime=" + startTime +
				", endTime=" + endTime +
				", ascLimit=" + ascLimit +
				", minimumNumber=" + minimumNumber +
				", narrowImage='" + narrowImage + '\'' +
				", presentImage='" + presentImage + '\'' +
				", progressImage='" + progressImage + '\'' +
				", raidersImage='" + raidersImage + '\'' +
				", shareImage='" + shareImage + '\'' +
				", activityRouterUrl='" + activityRouterUrl + '\'' +
				", businessDate=" + businessDate +
				", userId='" + userId + '\'' +
				", rule='" + rule + '\'' +
				", useStatus=" + useStatus +
				", source='" + source + '\'' +
				", createTime=" + createTime +
				'}';
	}
}
