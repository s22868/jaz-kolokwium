package com.example.demo.service;

import com.example.demo.models.DbResponse;
import com.example.demo.models.NBPResponse;
import com.example.demo.repository.NBPRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NBPService {
    //    http://api.nbp.pl/api/exchangerates/rates/a/gbp/2012-01-01/2012-01-31/
    private final String url = "https://api.nbp.pl/api/exchangerates/tables/a/";
    private final RestTemplate restTemplate;
    private final NBPRepository nbpRepository;

    public NBPService(RestTemplate restTemplate, NBPRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }

    public DbResponse midExchange(Double avg, String from, String to){
        NBPResponse res = restTemplate.getForObject(url + "{from}/{to}?format=json", NBPResponse.class, from, to);

        Integer currNumber = 1;


        DbResponse dbRes = new DbResponse(avg, currNumber, from, to);

        return nbpRepository.save(dbRes);
    }


}