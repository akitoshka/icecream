package com.demo.icecream;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nikita on 21.04.19.
 */
@Controller
public class IceCreamController {
  int count = 0;

  @GetMapping("/add/{count}")
  @ResponseBody
  public String addIceCream(@PathVariable Integer count) {
    this.count += count;
    return "Добавлено "+count+". Всего "+ this.count;
  }

  @GetMapping("/get/{count}")
  @ResponseBody
  public String getIceCream(@PathVariable Integer count) {
    if (count <= this.count) {
      this.count -= count;
      return "Возьмите ваше мороженное в количестве "+count+" штук";
    }
    return "Иди лесом, у меня нет столько мороженного!";
  }
}
