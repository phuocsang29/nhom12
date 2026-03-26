package Nhom12.NguyenNgocPhuocSang;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        model.addAttribute("currentTime", dtf.format(LocalDateTime.now()));
        model.addAttribute("appName", "Nguyễn Ngọc Phước Sang");
        model.addAttribute("groupName", "Nhóm 12");
        return "index";
    }
}
