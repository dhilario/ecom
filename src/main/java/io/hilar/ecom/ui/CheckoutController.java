package io.hilar.ecom.ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("checkout")
public class CheckoutController {

  Logger log = LoggerFactory.getLogger(CheckoutController.class);

  @GetMapping("/view")
  public String showView(Model model) {

    return "checkout";
  }
}
