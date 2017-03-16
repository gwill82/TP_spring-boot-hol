package fr.insalyon.tc.asciidoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wgata on 16/03/17.
 */

@RestController
public class DocConverterController {

    private final AsciidoctorService asciidoctorService;

    @Autowired
    public DocConverterController(AsciidoctorService asciidoctorService) {
        this.asciidoctorService = asciidoctorService;
    }

    @PostMapping(value = "/asciidoc", produces = "text/html",consumes = "text/asciidoc")
    public String convertToHtmlDocument(@RequestBody String asciidocsource) {

        String HtmlDoc = this.asciidoctorService.convertToHtmlDocument(asciidocsource);

        return HtmlDoc;
    }
}

