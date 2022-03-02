import config.ProjectConfig;
import model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class app {

    public static void main(String[] args) {


        Comment comment = new Comment();
        comment.setAuthor("John");
        comment.setText("great job");


        ApplicationContext contrainer  = new AnnotationConfigApplicationContext(ProjectConfig.class);

        contrainer.getBean(CommentService.class).publishComment(comment);

    }
}
