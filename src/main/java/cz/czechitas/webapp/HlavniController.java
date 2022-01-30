package cz.czechitas.webapp;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class HlavniController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView zobrazIndex() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/male-form", method = RequestMethod.GET)
    public ModelAndView zobrazMaleForm() {
        return new ModelAndView("male-form");
    }

    @RequestMapping(value = "/male-form", method = RequestMethod.POST)
    public ModelAndView zpracujMaleForm(MaleService MaleService) {
        ModelAndView drzakNaData = new ModelAndView("vysledek");
        drzakNaData.addObject("velbloudi", MaleService.spoctiVelbloudy());
        drzakNaData.addObject("statement", MaleService.getStatement());
        return drzakNaData;
    }

    @RequestMapping(value = "/female-form", method = RequestMethod.GET)
    public ModelAndView zobrazFemaleForm() {
        return new ModelAndView("female-form");
    }

    @RequestMapping(value = "/female-form", method = RequestMethod.POST)
    public ModelAndView zpracujFemaleForm(FemaleService femaleService) {
        ModelAndView drzakNaData = new ModelAndView("vysledek");
        drzakNaData.addObject("velbloudi", femaleService.spoctiVelbloudy());
        drzakNaData.addObject("statement", femaleService.getStatement());
        return drzakNaData;
    }
}
