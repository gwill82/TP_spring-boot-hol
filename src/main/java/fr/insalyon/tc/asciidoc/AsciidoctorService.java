package fr.insalyon.tc.asciidoc;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Attributes;
import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.SafeMode;
import org.springframework.stereotype.Service;

/**
 * Created by wgata on 16/03/17.
 */
@Service
public class AsciidoctorService implements AsciidocConverter {
    @Override
    public String convertToHtmlDocument(String asciidocSource) {

        final Asciidoctor asciidoctor;
        final OptionsBuilder options;

        asciidoctor = Asciidoctor.Factory.create();
        Attributes attributes = new Attributes();
        attributes.setAttribute("source-highlighter",asciidocSource);
        attributes.setAnchors(true);
        options = OptionsBuilder.options().safe(SafeMode.SAFE).attributes(attributes);
        // create a full HTML document, with header and footer
        String fullHtmlDocument = asciidoctor.convert(asciidocSource, options.headerFooter(true));;

        return fullHtmlDocument;
    }

    @Override
    public String convertToHtmlSnippet(String asciidocSource) {
        final Asciidoctor asciidoctor;
        final OptionsBuilder options;

        asciidoctor = Asciidoctor.Factory.create();
        Attributes attributes = new Attributes();
        attributes.setAttribute("source-highlighter",asciidocSource);
        attributes.setAnchors(true);
        options = OptionsBuilder.options().safe(SafeMode.SAFE).attributes(attributes);
        // just create an HTML snippet, without header/footer
        String htmlSnippet = asciidoctor.convert(asciidocSource, options);

        return htmlSnippet;
    }
}
