package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Description: 活动卡卷配置
 * @Author: liaocongcong
 * @Date: 2020/10/26 14:29
 */


@Entity
@Table(name = "marketing_asc_card")
public class MarketingAscCardModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "activity_config_no", columnDefinition ="varchar(50) DEFAULT NULL COMMENT '活动配置编码'")
	private String activityConfigNo;

	@Column(name = "title", columnDefinition ="varchar(150) DEFAULT NULL COMMENT '优惠券标题'")
	private String title;

	@Column(name = "cover_image", columnDefinition ="varchar(400) DEFAULT NULL COMMENT '封面图片'")
	private String coverImage;

	@Column(name = "cover_present", columnDefinition ="text DEFAULT NULL COMMENT '封面简介'")
	private String coverPresent;

	@Column(name = "amount", columnDefinition = "int(11) DEFAULT 0 COMMENT '发放数量'")
	private Integer amount;

	@Column(name = "card_limit", columnDefinition = "int(11) DEFAULT 0 COMMENT '每人最多领几张'")
	private Integer cardLimit;

	@Column(name = "use_full", columnDefinition ="varchar(100) DEFAULT NULL COMMENT '满多少可用 单位分'")
	private String useFull;

	@Column(name = "use_cost", columnDefinition ="varchar(100) DEFAULT NULL COMMENT '可减金额 单位分'")
	private String useCost;

	@Column(name = "notice", columnDefinition ="text DEFAULT NULL COMMENT '使用须知'")
	private String notice;

	@Column(name = "create_time", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'")
	@JsonFormat(timezone = "GMT-6", locale = "zh", pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;

	@Column(name = "wx_card_id", columnDefinition ="varchar(100) DEFAULT NULL COMMENT '关联微信卡券编码'")
	private String wxCardId;

	@Column(name = "card_type", columnDefinition ="varchar(20) DEFAULT NULL COMMENT '卡券类型：代金券 优惠券'")
	private String cardType;

	@Column(name = "start_time", columnDefinition = "varchar(32) DEFAULT NULL COMMENT '开始时间'")
	private String startTime;

	@Column(name = "end_time", columnDefinition = "varchar(33) DEFAULT NULL COMMENT '结束时间'")
	private String endTime;

	@Column(name = "coupon_description", columnDefinition ="text DEFAULT NULL COMMENT '优惠说明'")
	private String couponDescription;

	@Column(name = "use_status", columnDefinition = "int(1) DEFAULT 1 COMMENT '伪删除 1:使用, 0:逻辑删除'",insertable = false)
	private Integer useStatus;

	public Integer getUseStatus() {
		return useStatus;
	}

	public void setUseStatus(Integer useStatus) {
		this.useStatus = useStatus;
	}

	public String getActivityConfigNo() {
		return activityConfigNo;
	}

	public void setActivityConfigNo(String activityConfigNo) {
		this.activityConfigNo = activityConfigNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getCoverPresent() {
		return coverPresent;
	}

	public void setCoverPresent(String coverPresent) {
		this.coverPresent = coverPresent;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(Integer cardLimit) {
		this.cardLimit = cardLimit;
	}

	public String getUseFull() {
		return useFull;
	}

	public void setUseFull(String useFull) {
		this.useFull = useFull;
	}

	public String getUseCost() {
		return useCost;
	}

	public void setUseCost(String useCost) {
		this.useCost = useCost;
	}

	public String getWxCardId() {
		return wxCardId;
	}

	public void setWxCardId(String wxCardId) {
		this.wxCardId = wxCardId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCouponDescription() {
		return couponDescription;
	}

	public void setCouponDescription(String couponDescription) {
		this.couponDescription = couponDescription;
	}
}
