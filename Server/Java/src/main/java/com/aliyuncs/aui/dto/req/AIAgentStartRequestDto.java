package Server.Java.src.main.java.com.aliyuncs.aui.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * AIAgentStartRequestDto
 *
 * @author chunlei.zcl
 */
@Data
public class AIAgentStartRequestDto {

    @NotBlank
    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("template_config")
    private String templateConfig;

    @NotBlank
    @JsonProperty("workflow_type")
    private String workflowType;
}
