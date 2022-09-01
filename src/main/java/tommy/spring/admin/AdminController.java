package tommy.spring.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AdminController {

@RequestMapping("/admin.dmo")
public String admin() {
return "admin";

}
}
