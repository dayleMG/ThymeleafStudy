package min.thymeleafbasic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {

    @RequestMapping("/text-basic")
    public String textBasic(Model model) {
        model.addAttribute("data", "Study ThymeLeaf");
        return "/basic/text-basic";
    }

    @RequestMapping("/text-unescaped")
    public String textUnEscaped(Model model) {
        model.addAttribute("data", "<b>Study ThymeLeaf</b>");
        return "/basic/text-unescaped";
    }

    
}
