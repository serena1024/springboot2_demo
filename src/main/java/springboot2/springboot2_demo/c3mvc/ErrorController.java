package springboot2.springboot2_demo.c3mvc;
/**在springboot中，Controller中的异常默认都交给/error处理,继承AbstractErrorController
 * 提供了多种从request里获取错误信息：
 * 1、timestamp错误发生的时间
 * 2、status：对于与http status
 * 3、error：错误消息，如bad request
 * 4、message：详细错误信息
 * 5、exception：如果应用抛出异常，exception是字符串，代表异常的类名
 * 6、path：请求的url
 * 7、errors：@Validated校验错误的时候，校验结果信息放到这里
 * @author yuyun
 *
 */
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
@Controller
public class ErrorController extends AbstractErrorController{

	public ErrorController(ErrorAttributes errorAttributes) {
		super(errorAttributes);
	}

	@Override
	public String getErrorPath() {
		return null;
	}
	
}
