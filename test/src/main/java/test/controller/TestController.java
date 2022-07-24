package test.controller;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import test.Member;
import test.TestRepository;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Controller
public class TestController {

    @Autowired
    TestRepository repository;

    @GetMapping("/")
    String index(Model model){

        model.addAttribute("title", "Home");

        return "index";
    }

    @GetMapping("/{formType}")
    String loginAndSign(Model model, @PathVariable String formType){
        String response = "";

        if(formType.equals("sign")){
            response = "sign";
            model.addAttribute("title", "sign-up");
        }else if(formType.equals("login")){
            response = "login";
            model.addAttribute("title", "sign-in");
        }

        return response;
    }

    @PostMapping("/login")
    String postLogin(Model model,
                     @RequestParam(value="id")String id,
                     @RequestParam(value="password")String pw) throws NoSuchAlgorithmException {

        Member member = repository.findById(id).orElseThrow();

        if(!member.getPw().equals(crypto(pw))){
            model.addAttribute("title", "fail");
            return "login";
        }else {
            model.addAttribute("title", member.getId());
            return "index";
        }

    }

    String crypto(String ss) throws NoSuchAlgorithmException {
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        sha.update(ss.getBytes());
        return bytesToHex(sha.digest());
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

}
