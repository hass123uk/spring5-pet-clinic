package com.hassanmahmud.hmpetclinic.controllers;

import com.hassanmahmud.hmpetclinic.model.Owner;
import com.hassanmahmud.hmpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@RequestMapping({"/owners", "/owners.html"})
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {

        Set<Owner> owners = ownerService.findAll();
        model.addAttribute("owners", owners);

        return "owners/index";
    }

    @RequestMapping({"/find"})
    public String findOwners(Model model) {

        return "notimplemented";
    }
}
