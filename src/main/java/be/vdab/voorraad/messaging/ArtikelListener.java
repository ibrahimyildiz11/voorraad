package be.vdab.voorraad.messaging;

import be.vdab.voorraad.events.ArtikelGemaakt;
import be.vdab.voorraad.services.ArtikelService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ArtikelListener {
    private final ArtikelService service;

    public ArtikelListener(ArtikelService service) {
        this.service = service;
    }
    @RabbitListener(queues = "voorraad")
    void verwerkBericht(ArtikelGemaakt gemaakt) {
        service.create(gemaakt.naarArtikel());
    }
}
