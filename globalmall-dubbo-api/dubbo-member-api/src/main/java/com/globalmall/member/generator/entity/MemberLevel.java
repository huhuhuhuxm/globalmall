package com.globalmall.member.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员等级
 * @TableName ums_member_level
 */
@TableName(value ="ums_member_level")
@Data
public class MemberLevel implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 等级名称
     */
    private String name;

    /**
     * 等级需要的成长值
     */
    private Integer growthPoint;

    /**
     * 是否为默认等级[0->不是；1->是]
     */
    private Integer defaultStatus;

    /**
     * 免运费标准
     */
    private BigDecimal freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    private Integer commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    private Integer priviledgeFreeFreight;

    /**
     * 是否有会员价格特权
     */
    private Integer priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    private Integer priviledgeBirthday;

    /**
     * 备注
     */
    private String note;

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
        MemberLevel other = (MemberLevel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGrowthPoint() == null ? other.getGrowthPoint() == null : this.getGrowthPoint().equals(other.getGrowthPoint()))
            && (this.getDefaultStatus() == null ? other.getDefaultStatus() == null : this.getDefaultStatus().equals(other.getDefaultStatus()))
            && (this.getFreeFreightPoint() == null ? other.getFreeFreightPoint() == null : this.getFreeFreightPoint().equals(other.getFreeFreightPoint()))
            && (this.getCommentGrowthPoint() == null ? other.getCommentGrowthPoint() == null : this.getCommentGrowthPoint().equals(other.getCommentGrowthPoint()))
            && (this.getPriviledgeFreeFreight() == null ? other.getPriviledgeFreeFreight() == null : this.getPriviledgeFreeFreight().equals(other.getPriviledgeFreeFreight()))
            && (this.getPriviledgeMemberPrice() == null ? other.getPriviledgeMemberPrice() == null : this.getPriviledgeMemberPrice().equals(other.getPriviledgeMemberPrice()))
            && (this.getPriviledgeBirthday() == null ? other.getPriviledgeBirthday() == null : this.getPriviledgeBirthday().equals(other.getPriviledgeBirthday()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGrowthPoint() == null) ? 0 : getGrowthPoint().hashCode());
        result = prime * result + ((getDefaultStatus() == null) ? 0 : getDefaultStatus().hashCode());
        result = prime * result + ((getFreeFreightPoint() == null) ? 0 : getFreeFreightPoint().hashCode());
        result = prime * result + ((getCommentGrowthPoint() == null) ? 0 : getCommentGrowthPoint().hashCode());
        result = prime * result + ((getPriviledgeFreeFreight() == null) ? 0 : getPriviledgeFreeFreight().hashCode());
        result = prime * result + ((getPriviledgeMemberPrice() == null) ? 0 : getPriviledgeMemberPrice().hashCode());
        result = prime * result + ((getPriviledgeBirthday() == null) ? 0 : getPriviledgeBirthday().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", growthPoint=").append(growthPoint);
        sb.append(", defaultStatus=").append(defaultStatus);
        sb.append(", freeFreightPoint=").append(freeFreightPoint);
        sb.append(", commentGrowthPoint=").append(commentGrowthPoint);
        sb.append(", priviledgeFreeFreight=").append(priviledgeFreeFreight);
        sb.append(", priviledgeMemberPrice=").append(priviledgeMemberPrice);
        sb.append(", priviledgeBirthday=").append(priviledgeBirthday);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
