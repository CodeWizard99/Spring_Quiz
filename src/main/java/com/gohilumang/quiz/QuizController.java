package com.gohilumang.quiz;

import com.gohilumang.dao.getData;
import com.gohilumang.Question.Question;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuizController {
    
    @GetMapping("/quiz")
    @ResponseBody
    public String handle(@RequestParam String topic, Model model) {
        
        int i = 1;
        Question q;
        SqlRowSet srs = getData.get(topic);
        while(srs.next()){
            
            q = new Question(srs.getString("question"), srs.getString("A"), srs.getString("B"), srs.getString("C"), srs.getString("D"), srs.getString("correct_answer"));
            model.addAttribute(String.valueOf(i), q);
            i++;
        }
        return "quiz";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
