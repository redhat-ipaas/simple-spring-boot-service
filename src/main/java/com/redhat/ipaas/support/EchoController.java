package com.redhat.ipaas.support;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EchoController {

  @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/text")
  @ResponseBody
  public String helloRest() {
    return "Hello World!";
  }

  @RequestMapping(value = "/goodbye", method = RequestMethod.POST)
  @ResponseBody
  public String goodbyeRest() {
    return "Goodbye!";
  }

}
