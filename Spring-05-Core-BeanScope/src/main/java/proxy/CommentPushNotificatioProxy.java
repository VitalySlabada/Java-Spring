package proxy;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentPushNotificatioProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " +comment.getText());
    }
}
