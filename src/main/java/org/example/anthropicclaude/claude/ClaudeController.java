package org.example.anthropicclaude.claude;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claude")
public class ClaudeController {

    private final ClaudeService claudeService;

    @Autowired
    public ClaudeController(ClaudeService claudeService) {
        this.claudeService = claudeService;
    }

    @GetMapping("/ask")
    public String askClaude(@RequestParam String prompt) {
        return claudeService.getResponseFromClaude(prompt);
    }
}

