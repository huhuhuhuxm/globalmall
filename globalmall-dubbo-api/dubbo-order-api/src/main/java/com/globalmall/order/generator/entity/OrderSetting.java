package com.globalmall.order.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单配置信息
 * @TableName oms_order_setting
 */
@TableName(value ="oms_order_setting")
@Data
public class OrderSetting implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 秒杀订单超时关闭时间(分)
     */
    private Integer flashOrderOvertime;

    /**
     * 正常订单超时时间(分)
     */
    private Integer normalOrderOvertime;

    /**
     * 发货后自动确认收货时间（天）
     */
    private Integer confirmOvertime;

    /**
     * 自动完成交易时间，不能申请退货（天）
     */
    private Integer finishOvertime;

    /**
     * 订单完成后自动好评时间（天）
     */
    private Integer commentOvertime;

    /**
     * 会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
     */
    private Integer memberLevel;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderSetting other = (OrderSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlashOrderOvertime() == null ? other.getFlashOrderOvertime() == null : this.getFlashOrderOvertime().equals(other.getFlashOrderOvertime()))
            && (this.getNormalOrderOvertime() == null ? other.getNormalOrderOvertime() == null : this.getNormalOrderOvertime().equals(other.getNormalOrderOvertime()))
            && (this.getConfirmOvertime() == null ? other.getConfirmOvertime() == null : this.getConfirmOvertime().equals(other.getConfirmOvertime()))
            && (this.getFinishOvertime() == null ? other.getFinishOvertime() == null : this.getFinishOvertime().equals(other.getFinishOvertime()))
            && (this.getCommentOvertime() == null ? other.getCommentOvertime() == null : this.getCommentOvertime().equals(other.getCommentOvertime()))
            && (this.getMemberLevel() == null ? other.getMemberLevel() == null : this.getMemberLevel().equals(other.getMemberLevel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlashOrderOvertime() == null) ? 0 : getFlashOrderOvertime().hashCode());
        result = prime * result + ((getNormalOrderOvertime() == null) ? 0 : getNormalOrderOvertime().hashCode());
        result = prime * result + ((getConfirmOvertime() == null) ? 0 : getConfirmOvertime().hashCode());
        result = prime * result + ((getFinishOvertime() == null) ? 0 : getFinishOvertime().hashCode());
        result = prime * result + ((getCommentOvertime() == null) ? 0 : getCommentOvertime().hashCode());
        result = prime * result + ((getMemberLevel() == null) ? 0 : getMemberLevel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flashOrderOvertime=").append(flashOrderOvertime);
        sb.append(", normalOrderOvertime=").append(normalOrderOvertime);
        sb.append(", confirmOvertime=").append(confirmOvertime);
        sb.append(", finishOvertime=").append(finishOvertime);
        sb.append(", commentOvertime=").append(commentOvertime);
        sb.append(", memberLevel=").append(memberLevel);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
