package com.example.barbershop;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private ClientService service;

    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword){
        List<Client> listClient = service.listAll(keyword);
        model.addAttribute("listClient", listClient);
        model.addAttribute("keyword", keyword);
        return "index";
    }
    @RequestMapping("/new")
    public String showNewClientForm(Model model){
        Client client = new Client();
        model.addAttribute("client", client);
        return "new_client";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("client") Client client){
        service.save(client);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditClientFrom(@PathVariable(name="id") Long id){
        ModelAndView mav = new ModelAndView("edit_client");
        Client client = service.get(id);
        mav.addObject("Client", client);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteClient(@PathVariable(name="id") Long id){
        service.delete(id);
        return "redirect:/";
    }

}