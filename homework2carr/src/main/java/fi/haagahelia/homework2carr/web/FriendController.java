package fi.haagahelia.homework2carr.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import fi.haagahelia.homework2.domain.Friend;

@Controller
public class FriendController {

    private List<Friend> friends = new ArrayList<>();

    @GetMapping("/friendlist")
    public String friendList(Model model) {
        model.addAttribute("friends", friends);
        return "friends";
    }

    @GetMapping("/add")
    public String addFriendList(Model model) {
        model.addAttribute("friend", new Friend());
        return "add_friend";
    }

    @PostMapping("/friends")
    public String saveNewFriend(@ModelAttribute Friend friend) {
        friends.add(friend);
        return "redirect:/friendlist";
    }

}
