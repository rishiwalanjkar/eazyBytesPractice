package org.eazybytes.service;

import lombok.extern.slf4j.Slf4j;
import org.eazybytes.model.Contact;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService {

    public boolean saveContactDetails(Contact contact) {
        log.info(contact.toString());

        return true;
    }
}
