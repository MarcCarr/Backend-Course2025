package fi.haagahelia.homework2carr.web;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import fi.haagahelia.homework2.domain.Student;
import org.springframework.ui.Model;

@Controller
public class StudentsListController {

    @GetMapping("/helloStudents")
    public String listStudents(Model model) {
        Student bob = new Student();
        bob.setFirstName("Bob");
        bob.setLastname("Ross");

        Student john = new Student();
        john.setFirstName("John");
        john.setLastname("Wayne");

        Student katy = new Student();
        katy.setFirstName("Katy");
        katy.setLastname("Perry");

        List<Student> studentList = new ArrayList<>();
        studentList.add(bob);
        studentList.add(john);
        studentList.add(katy);

        model.addAttribute("studentlist", studentList);
        return "studentlist";
    }

}
