package Server.Java.src.main.java.com.aliyuncs.aui.service;

import com.aliyuncs.aui.dto.res.AiAgentStartResponse;
import com.aliyuncs.aui.dto.res.CommonResponse;
import com.aliyuncs.aui.dto.res.GenerateAIAgentCallResponse;

/**
 * AiAgentService
 *
 * @author chunlei.zcl
 */
public interface AiAgentService {

    AiAgentStartResponse startAiAgent(String ChannelId, String userId, String rtcAuthToken, String templateConfig, String workflowType);

    CommonResponse stopAiAgent(String aiAgentInstanceId);

    CommonResponse updateAiAgent(String aiAgentInstanceId, String config);

    GenerateAIAgentCallResponse generateAIAgentCall(String aiAgentId, String userId, Integer expire, String templateConfig, String workflowType, String region);
}
