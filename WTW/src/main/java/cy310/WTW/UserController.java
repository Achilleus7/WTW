package cy310.WTW;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value="/newuser", method = RequestMethod.POST)
    @ResponseBody User newUser(@RequestBody User newUser)
    {
        return repository.save(newUser);
    }

    @GetMapping(value = "/user/{username}")
    User getUser(@PathVariable String username)
    {
        System.out.println("User accessed");
        System.out.println(repository.findByUsername(username));
        return repository.findByUsername(username);
    }

    @GetMapping(value = "weatherdata")
    WeatherData getWeatherData()
    {
        return new WeatherData();
    }

    @ExceptionHandler(com.mongodb.MongoWriteException.class)
    public @ResponseBody
    HttpStatus handleException()
    {
        System.out.println("handled");
        return HttpStatus.BAD_REQUEST;
    }


}
