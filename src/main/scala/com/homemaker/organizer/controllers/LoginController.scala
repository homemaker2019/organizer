package com.homemaker.organizer.controllers
import com.homemaker.organizer.model.LoginModel
import javax.validation.Valid
import org.springframework.validation.BindingResult
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(Array("/customer"))
class HotelController() {

  @GetMapping(Array("/{id}"))
  def getCustomerDetails(@PathVariable("id") id: String): String = {
    return id
  }

  @PostMapping(value = Array("/logIn"))
  def create(@Valid loginModel: LoginModel,
             bindingResult: BindingResult): String = {
    if (bindingResult.hasErrors()) {
      return "logged out"
    } else {
      return "logged in"
    }
  }

}
