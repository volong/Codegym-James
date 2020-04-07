package com.cg.maven.tutorial.controller;


import com.cg.maven.tutorial.model.Customer;
import com.cg.maven.tutorial.service.CustomerService;
import com.cg.maven.tutorial.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
  private CustomerService customerService = new CustomerServiceImpl();

  @GetMapping("/")
    public String index(Model model) {
      model.addAttribute("customers", customerService.findAll());
      return "index";
  }

  @GetMapping("/create")
  public String create(Model model) {
    model.addAttribute("customer", new Customer());
    return "create";
  }

  @PostMapping("/save")
  public String save(Customer customer, RedirectAttributes redirect) {
    customer.setId((int) (Math.random() * 10000));
    customerService.save(customer);
    redirect.addFlashAttribute("success", "Saved customer successfully");
    return "redirect:/";
  }


  @GetMapping("/{id}/edit")
  public String edit(@PathVariable int id, Model model) {
    model.addAttribute("customer", customerService.findById(id));
    return "edit";
  }

  @PostMapping("/update")
  public String update(Customer customer, RedirectAttributes redirect) {
    customerService.update(customer.getId(), customer);
    redirect.addFlashAttribute("success", "Modified customer successfully!");
    return "redirect:/";
  }


  @GetMapping("/{id}/delete")
  public String delete(@PathVariable int id, Model model) {
    model.addAttribute("customer", customerService.findById(id));
    return "delete";
  }

  @PostMapping("/delete")
  public String delete(Customer customer, RedirectAttributes redirect) {
    customerService.remove(customer.getId());
    redirect.addFlashAttribute("success", "Removed customer successfully!");
    return "redirect:/";
  }


  @GetMapping("/{id}/view")
  public String view(@PathVariable int id, Model model) {
    model.addAttribute("customer", customerService.findById(id));
    return "view";
  }


}
