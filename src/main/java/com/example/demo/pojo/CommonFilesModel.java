package com.example.demo.pojo;

import javax.persistence.*;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/10/27 18:45
 */


@Entity
@Table( name ="marketing_common_files")
public class CommonFilesModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "file_url" ,columnDefinition="varchar(400) NULL COMMENT '文件url'")
	private String fileUrl;

	@Column(name = "file_type" ,columnDefinition="tinyint(1) NOT NULL DEFAULT 0 COMMENT '文件类型1-图片，2-文件'")
	private Integer fileType;

	@Column(name = "linkid" ,columnDefinition="int(8) NOT NULL DEFAULT 0 COMMENT '关联id'")
	private Long linkid;

	@Column(name = "activity_config_no", columnDefinition ="varchar(32) DEFAULT NULL COMMENT '活动配置编码'")
	private String activityConfigNo;

	@Column(name = "comefrom" ,columnDefinition="varchar(32) NULL COMMENT '自来哪个模块上传的'")

	private String comefrom;

	public String getActivityConfigNo() {
		return activityConfigNo;
	}

	public void setActivityConfigNo(String activityConfigNo) {
		this.activityConfigNo = activityConfigNo;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Integer getFileType() {
		return this.fileType;
	}

	public void setFileType(Integer fileType) {
		this.fileType = fileType;
	}

	public Long getLinkid() {
		return this.linkid;
	}

	public void setLinkid(Long linkid) {
		this.linkid = linkid;
	}

	public String getComefrom() {
		return this.comefrom;
	}

	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
	}

}
