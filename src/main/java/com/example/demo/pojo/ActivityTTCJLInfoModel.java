package com.example.demo.pojo;

import javax.persistence.*;

/**
 * @Description 天天抽锦鲤活动信息表
 * @Author liaocongcong
 * @Date 2020-11-24 10:37
 */
@Entity
@Table(name = "matketing_ttlinfo_model")
public class ActivityTTCJLInfoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "activity_type", columnDefinition = "varchar(50) NULL COMMENT '活动标识'")
    private String activityType;

    @Column(name = "ssoid", columnDefinition = "bigint(11)  COMMENT '账号ssoid'")
    private Long ssoid;

    @Column(name = "product_type", length = 50, columnDefinition = "varchar(50) NULL COMMENT '产品品类 电视-ACTIVITY_PRODUCT_TYPE_0 冰箱、空调、洗衣机-ACTIVITY_PRODUCT_TYPE_1'")
    private String productType;

    @Column(name = "serial_number", length = 50, columnDefinition = "varchar(50) NULL COMMENT '序列号'")
    private String serialNumber;

    @Column(name = "invoice_img_url", length = 200, columnDefinition = "varchar(200) NULL COMMENT '发票图路径'")
    private String invoiceImgURL;

    @Column(name = "mobile_phone", length = 50, columnDefinition = "varchar(50) NULL COMMENT '手机号'")
    private String mobilePhone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Long getSsoid() {
        return ssoid;
    }

    public void setSsoid(Long ssoid) {
        this.ssoid = ssoid;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getInvoiceImgURL() {
        return invoiceImgURL;
    }

    public void setInvoiceImgURL(String invoiceImgURL) {
        this.invoiceImgURL = invoiceImgURL;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
