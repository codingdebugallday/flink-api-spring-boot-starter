package com.github.codingdebugallday.client.domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

/**
 * <p>
 * description
 * </p>
 *
 * @author isacc 2020/03/25 17:51
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@TableName(value = "flink_node")
public class Node implements Serializable {

    private static final long serialVersionUID = 1208427498280311922L;

    public static final String FIELD_NODE_ID = "node_id";
    public static final String FIELD_CLUSTER_CODE = "cluster_code";
    public static final String FIELD_NODE_TYPE = "node_type";
    public static final String FIELD_TENANT_ID = "tenant_id";

    @TableId(type = IdType.AUTO)
    private Long nodeId;

    private String clusterCode;

    private String nodeCode;
    private String nodeType;

    private String nodeDesc;
    
    private String settingInfo;

    private Integer enabledFlag;

    private Long tenantId;
    @Version
    private Long objectVersionNumber;
    private LocalDateTime creationDate;
    private Long createdBy;
    private LocalDateTime lastUpdateDate;
    private Long lastUpdatedBy;

}
