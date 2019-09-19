package com.onlinecredits;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

private final String sharedKey="SHARED_KEY";
private static final String SUCCESS_MESSAGE="success";
private static final String ERROR_MESSAGE="error";
private static final int CODE_SUCCESS=100;
private static final int AUTH_FAILURE=102;

@RequestMapping(value="/hello", method = RequestMethod.POST)
    public Response log(@RequestParam(value="name") String name, @RequestBody Login login) {
    Response response = new Response();

    int userName = login.getUserName();
    String password= login.getPassword();

    System.out.println(login.toString());

    response.setName(name);
    return response;
}



}
