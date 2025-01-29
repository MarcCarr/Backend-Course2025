package fi.haagahelia.homework2carr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import fi.haagahelia.homework2.domain.Friend;

@Controller
public class FriendController2 {

    private List<Friend> friendsList = new ArrayList<>();

    @GetMapping("/friends_add")
    public String friendsListPage(Model model) {
        model.addAttribute("friendsList", friendsList);
        model.addAttribute("friend", new Friend());
        return "friends_add";
    }

    @PostMapping("/friends_add")
    public String addFriend(@ModelAttribute Friend friend) {
        friendsList.add(friend);
        return "redirect:/friends_add";
    }
}
