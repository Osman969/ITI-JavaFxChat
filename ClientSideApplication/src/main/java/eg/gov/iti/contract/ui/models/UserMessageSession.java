package eg.gov.iti.contract.ui.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.scene.image.ImageView;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "sessionChat")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserMessageSession {
    @XmlTransient
    private String name;
    @XmlElement(name = "body")
    private String messageBody;
    @XmlTransient
    private String imageEncoded;
    private Date messageDate;
    @XmlTransient
    private ImageView imageView;
    @XmlElement(name = "sender")
    private String senderPHoneNumber;
    @XmlElement(name = "receiver")
    private String receiverPhoneNumber;

    public UserMessageSession() {
    }

    public UserMessageSession(String name, String messageBody, String imageEncoded, Date messageDate, ImageView imageView, String senderPHoneNumber, String receiverPhoneNumber) {
        this.name = name;
        this.messageBody = messageBody;
        this.imageEncoded = imageEncoded;
        this.messageDate = messageDate;
        this.imageView = imageView;
        this.senderPHoneNumber = senderPHoneNumber;
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getImageEncoded() {
        return imageEncoded;
    }

    public void setImageEncoded(String imageEncoded) {
        this.imageEncoded = imageEncoded;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public String getSenderPHoneNumber() {
        return senderPHoneNumber;
    }

    public void setSenderPHoneNumber(String senderPHoneNumber) {
        this.senderPHoneNumber = senderPHoneNumber;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    @Override
    public String toString() {
        return "UserMessageSession{" +
                "name='" + name + '\'' +
                ", messageBody='" + messageBody + '\'' +
                ", imageEncoded='" + imageEncoded + '\'' +
                ", messageDate=" + messageDate +
                ", imageView=" + imageView +
                ", senderPHoneNumber='" + senderPHoneNumber + '\'' +
                ", receiverPhoneNumber='" + receiverPhoneNumber + '\'' +
                '}';
    }

    @Override
    public UserMessageSession clone() throws CloneNotSupportedException {
        return (UserMessageSession) super.clone();
    }
}
