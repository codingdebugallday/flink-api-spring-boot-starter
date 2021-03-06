package com.github.codingdebugallday.client.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * <p>
 * description
 * </p>
 *
 * @author isacc 2020/04/02 15:21
 * @since 1.0
 */
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeSettingInfo {

    private String host;
    private String username;
    private String password;
    /**
     * 是否需要修改该节点的密码
     */
    @Builder.Default
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Boolean changePassword = false;
}
