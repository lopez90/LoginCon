package com.logicon.web.controller;

import com.logicon.dto.User;
import com.logicon.service.impl.UserServiceImpl;
import com.logicon.util.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Dom on 18.06.2016.
 */
@Controller
@RequestMapping("/user")
public class UserServiceController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    // Wyswietla strone gdzie jest formularz wersja standard Kod
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddUserPage(Model model){
        return "add";
    }

    // Wyswietla strone gdzie jest formularz wersja AJAX Style
    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public String showAddUserPage2(Model model){
        return "add2";
    }

    // Obsluga POSTa ze formularza standard style, "add.jsp"
    // Pola przypisujesz poprzez @RequestParam, nazwa pola (ten parametr przy adnotacji) musi byc identyko jak nazwa zdeklarowana w formularzu, w .jsp
    @RequestMapping(value = "/addedStandard", method = RequestMethod.POST)
    public String addUserStandard(@RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("email") String email, Model model){
        // Tworzysz nowwego usera, i go ustawiasz tym co dostales postem, chyba jasne
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);

        // tutaj robisz rejestracje, powinno to byc zapisanie w BD, ale narazie dla picu.
        userServiceImpl.register(user);

        // dla testow i ilustracji, dodaje do modelu, a pozniej wyswietle to w JSP
        model.addAttribute("user", user);

        // zwracam nazwe widoku, tutaj pojawi sie added.jsp, gdzie sobie wypisze to co przyszlo POST'em
        return "added";
    }

    // Obsluga POSTA z AJAX'a, "add2.jsp"
    // consumes -> deklarujesz w jakiej formie przyjdą dane, najczesciej uzywane JSON (JavaScript Object Notation, se poczytaj z grubsza jak to jest zbudowane), czasami moze sie pojawic XML, wtedy wiadomo dajesz MediaType.APPLICATION_XML_VALUE
    // produces -> deklarujesz w jakiej formie odpowiesz do AJAX'a, okreslasz na co ma ci to sparsowac, robi to automatycznie, musisz miec tylko odpowiednia biblioteke dodana co projektu w Gradle. W JSON jest to:
    // compile 'com.fasterxml.jackson.core:jackson-databind:2.6.3'
    // compile 'com.fasterxml.jackson.core:jackson-core:2.6.3'
    // @ResponseBody okresla ze "zwracasz ciało" czyli tak jak wyzej opisane, nie bedzie to widok tylko JSON. XML...
    // @RequestBody okresla ze to co przyjdzie w zadaniu (jaka to bedzie forma, okreslasz jak wyzej opisane w consumes !!!) ma byc z automatu sparsowane w twoj obiekt User'a.
    // Wymaganie jest takie, ze musisz miec pola nazywajace sie jak te w formularzu jsp, i gettery//settery zeby mogl to jakos sobie wrzucic
    @RequestMapping(value = "/added2", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody GenericResponse registerUserAccount(@RequestBody User user, Model model)
    {
        // jak wyzej, dodawanie dla picu
        userServiceImpl.register(user);

        // tutaj zwracasz odpowiedz, GenericResponse to nie wbudowana klasa, tylko dodana przezemnie, proste DTO, bez szału, nie ma tam żadnej logiki działania... przejrzyj to sobie.
        // jest tam tylko jeden konstruktor ktory przyjmuje liste, parsuje to itd. ale to olej, narazie tego nie bedziesz uzywal, ja w calej inż. też nie potrzebowałem tego.
        return new GenericResponse("Dodawanie sie kurde udalo! Sukces jak ja nie moge!");
    }
}
