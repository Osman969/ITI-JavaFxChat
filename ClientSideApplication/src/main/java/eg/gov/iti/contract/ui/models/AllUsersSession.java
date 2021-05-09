package eg.gov.iti.contract.ui.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "sessionChat")
@XmlAccessorType(XmlAccessType.FIELD)
public class AllUsersSession {
    @XmlElement(name = "message")
    private List<UserMessageSession> userMessageSessions = new ArrayList<>();

    public AllUsersSession() {
    }

    public List<UserMessageSession> getUserMessageSessions() {
        return userMessageSessions;
    }

    public void setUserMessageSessions(List<UserMessageSession> userMessageSessions) {
        this.userMessageSessions = userMessageSessions;
    }
}
